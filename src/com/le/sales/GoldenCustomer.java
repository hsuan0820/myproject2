package com.le.sales;

  public class GoldenCustomer extends Customer{

      public GoldenCustomer(String id, int amount) {
          super(id, amount);
      }
      public float backMoney() {
          return amount*off;
      }
  }


