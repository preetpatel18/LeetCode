package Easy;

public class AccountBalanceAfterRoundedPurchase {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        if (purchaseAmount % 10 == 0) {
            return (100 - purchaseAmount);
        }
        purchaseAmount = (purchaseAmount + 5) / 10;
        return (100 - (purchaseAmount * 10));
    }
}
