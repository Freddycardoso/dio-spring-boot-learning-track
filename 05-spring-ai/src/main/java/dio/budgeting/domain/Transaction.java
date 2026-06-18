package dio.budgeting.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

@Getter
@AllArgsConstructor
public class Transaction {
    private TransactionId id;
    
    @NotBlank(message = "A descrição não pode estar em branco")
    private String description;
    
    @Positive(message = "O valor deve ser maior que zero")
    private long amount;
    
    private Category category;

    public Transaction(String description, long amount, Category category) {
        this.id = new TransactionId();
        this.description = description;
        this.amount = amount;
        this.category = category;
    }
}
