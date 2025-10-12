package br.com.dio.model;

import lombok.Getter;
import lombok.ToString;

import java.util.List;

import static br.com.dio.model.BankService.INVESTMENT;

@Getter
public class InvestmentWallet extends Wallet {

    private final Investment investment;
    private final AccountWallet account;
    private boolean active;

    public InvestmentWallet(final Investment investment, final AccountWallet account, final List<Money> initialFunds) {
        super(INVESTMENT);
        this.investment = investment;
        this.account = account;
        this.active = true;
        addMoney(initialFunds, getService(), "investimento inicial");
    }

    public long updateAmount(final long percent) {
        long currentFunds = getFunds();
        long interest = currentFunds * percent / 100;
        addMoney(generateMoney(interest, "rendimento"), getService(), "rendimento");
        return interest;
    }// addMoney(List.of(new Money(interest) ), getService(), "rendimento");

    public void setInactive() {
        this.active = false;
    }

    @Override
    public String toString() {
        return "InvestmentWallet{" +
                "investment=" + investment +
                ", account=" + account +
                '}';
    }

}
