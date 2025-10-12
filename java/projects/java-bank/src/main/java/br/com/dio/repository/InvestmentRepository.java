package br.com.dio.repository;

import br.com.dio.exception.AccountWithInvestmentException;
import br.com.dio.exception.InvestmentNotFoundException;
import br.com.dio.exception.WalletNotFoundException;
import br.com.dio.model.AccountWallet;
import br.com.dio.model.Investment;
import br.com.dio.model.InvestmentWallet;
import java.util.ArrayList;
import java.util.List;
import static br.com.dio.repository.CommonsRepository.checkFundsForTransaction;

public class InvestmentRepository {

    private long nextId;
    private final List<Investment> investments = new ArrayList<>();
    private final List<InvestmentWallet> wallets = new ArrayList<>();
    private final List<InvestmentWallet> closedWallets = new ArrayList<>();

    public Investment create(final long tax, final long initialFunds) {
        this.nextId ++;
        var Investment = new Investment(this.nextId, tax, initialFunds);
        this.investments.add(Investment);
        return Investment;
    }

    public InvestmentWallet initInvestment(final AccountWallet account, final long id) {
        var accountsInUse = wallets.stream().map(InvestmentWallet::getAccount).toList();
            if (accountsInUse.contains(account)) {
                throw new AccountWithInvestmentException("A conta '" + account + "' ja possui um investimento");
            }

        var investment = findById(id);
        checkFundsForTransaction(account, investment.initialFunds());
        var initialFunds = account.reduceMoney(investment.initialFunds());
        var wallet = new InvestmentWallet(investment, account, initialFunds);
        wallets.add(wallet);
        return wallet;
    }

    public InvestmentWallet deposit(final String pix, final long funds) {
        var wallet = findWalletByAccountPix(pix);
        checkFundsForTransaction(wallet.getAccount(), funds);
        wallet.addMoney(wallet.getAccount().reduceMoney(funds), wallet.getService(), "deposito de investimento");
        return wallet;
    }

   public InvestmentWallet withdraw(final String pix, final long funds) {
        var wallet = findWalletByAccountPix(pix);
       checkFundsForTransaction(wallet, funds);
       wallet.getAccount().addMoney(wallet.reduceMoney(funds), wallet.getService(), "saque de investimento");

       if (wallet.getFunds() == 0) {
           wallet.setInactive();
           wallets.remove(wallet);
           closedWallets.add(wallet);
       }
       return wallet;
   }

    public long updateAmount() {
        long totalInterest = 0;
        for (var w : wallets) {
            totalInterest += w.updateAmount(w.getInvestment().tax());
        }
        return totalInterest;
    }

    public Investment findById(final long id) {
        return investments.stream()
                .filter(i -> i.id() == id)
                .findFirst()
                .orElseThrow(
                        () -> new InvestmentNotFoundException("O investimento'" + id + "' nao foi encontrado")
                );
    }

    public InvestmentWallet findWalletByAccountPix(final String pix) {
        return wallets.stream()
                .filter(w -> w.getAccount().getPix().contains(pix))
                .findFirst()
                .orElseThrow(
                        () -> new WalletNotFoundException("A carteira nao foi encontrada")
                );

    }

    public List<InvestmentWallet> listWallets(){
        return this.wallets;
    }

    public List<Investment> list(){
        return this.investments;
    }
}
