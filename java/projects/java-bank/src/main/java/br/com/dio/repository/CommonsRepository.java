package br.com.dio.repository;

import br.com.dio.exception.NoFundsEnoughException;
import br.com.dio.model.Money;
import br.com.dio.model.MoneyAudit;
import br.com.dio.model.Wallet;
import lombok.NoArgsConstructor;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;
import java.util.stream.Stream;

import static br.com.dio.model.BankService.ACCOUNT;
import static lombok.AccessLevel.PRIVATE;

@NoArgsConstructor(access = PRIVATE)
public class CommonsRepository {

    public static void checkFundsForTransaction(final Wallet source, final long amount) {
        if (source.getFunds() < amount) {
            throw new NoFundsEnoughException("Sua conta nao tem fundos o suficiente para realizar essa transaçao ");
        }
    }

    public static List<Money> generateMoney(final UUID transactionId, final long funds, final String description) {
        if (funds <= 0 || funds > Integer.MAX_VALUE) {
            throw new IllegalArgumentException("O valor de funds deve ser positivo e menor que " + Integer.MAX_VALUE);
        }
        var history = new MoneyAudit(transactionId, ACCOUNT, description, OffsetDateTime.now());
        return Stream.generate(() -> new Money(history)).limit((int) funds).toList();
    }
}
