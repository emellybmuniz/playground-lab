package br.com.dio.repository;

import br.com.dio.exception.AccountNotFoundException;
import br.com.dio.exception.PixInUseException;
import br.com.dio.model.AccountWallet;
import br.com.dio.model.Money;
import java.util.ArrayList;
import java.util.List;
import static br.com.dio.repository.CommonsRepository.checkFundsForTransaction;

public class AccountRepository {

    private final List<AccountWallet> accounts = new ArrayList<>();

    public AccountWallet  create(final List<String> pix, final long initialFunds) {
        var pixInUse = accounts.stream().flatMap(a -> a.getPix().stream()).toList();
        for (var p : pix) {
            if (pixInUse.contains(p)) {
                throw new PixInUseException("A chave pix '" + p + "' ja esta em uso");
            }
        }
        var newAccount = new AccountWallet(initialFunds, pix);
        accounts.add(newAccount);
        return newAccount;
    }

    public void deposit(final String pix, final long fundsAmount) {
        var target = findByPix(pix);
        target.addMoney(fundsAmount, "deposito");
    }

    public List<Money> withdraw(final String pix, final long amount) {
        var source =  findByPix(pix);
        checkFundsForTransaction(source, amount);
        return source.reduceMoney(amount);
    }

    public void transferMoney(final String sourcePix, final String targetPix, final long amount) {
        var source = findByPix(sourcePix);
        checkFundsForTransaction(source, amount);
        var target = findByPix(targetPix);
        var message = "pix enviado de '" + sourcePix + "' para '" + targetPix + "'";
        target.addMoney(source.reduceMoney(amount), source.getService(), message);
    }

    public AccountWallet findByPix(final String pix) {
        return accounts.stream()
                .filter(a -> a.getPix().contains(pix))
                .findFirst()
                .orElseThrow(() -> new AccountNotFoundException("A conta com a chave pix " + pix + " nao foi encontrada"));
    }

    public List<AccountWallet> list() {
        return this.accounts;
    }
}
