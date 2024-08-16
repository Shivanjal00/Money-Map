package com.example.moneymap.viewmodel

import android.view.View
import androidx.lifecycle.ViewModel
import com.example.moneymap.data.dao.ExpenseDao
import com.example.moneymap.data.model.ExpenseEntity

class HomeViewModel(dao: ExpenseDao):ViewModel() {

    val expenses = dao.getAllExpenses()

    fun getBalance(list : List<ExpenseEntity>) : String {
        var total = 0.0
        list.forEach {
            if (it.type == "Income"){
                total += it.amount
            }else{
                total -= it.amount
            }
        }
        return "$ ${total}"
    }

    fun getTotalExpense(list : List<ExpenseEntity>) : String{

        var total = 0.0
        list.forEach {
            if (it.type == "Expense"){
                total += it.amount
            }
        }
        return "$ ${total}"
    }

    fun getTotalIncome(list : List<ExpenseEntity>) : String{

        var total = 0.0
        list.forEach {
            if (it.type == "Income"){
                total += it.amount
            }
        }
        return "$ ${total}"
    }
}