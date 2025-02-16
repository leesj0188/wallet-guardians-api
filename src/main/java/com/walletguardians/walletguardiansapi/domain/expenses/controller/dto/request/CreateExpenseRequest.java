package com.walletguardians.walletguardiansapi.domain.expenses.controller.dto.request;

import com.walletguardians.walletguardiansapi.domain.category.entity.Category;
import com.walletguardians.walletguardiansapi.domain.expenses.entity.Expense;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;

@Getter
public class CreateExpenseRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "expense_id")
    private Long id;

    private int amount;

    private Category category;

    private String description;

    private String storeName;

    public Expense toEntity() {
        return Expense.builder()
                .id(id)
                .amount(amount)
                .category(category)
                .description(description)
                .storeName(storeName)
                .build();
    }

}
