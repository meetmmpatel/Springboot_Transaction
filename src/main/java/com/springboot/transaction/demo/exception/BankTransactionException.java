package com.springboot.transaction.demo.exception;

public class BankTransactionException extends Exception {
  public BankTransactionException(String message) {
	super(message);
  }
  
}
