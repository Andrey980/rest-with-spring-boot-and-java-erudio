package br.com.erudio.restwithspringboot.math;

import java.lang.Math;

public class SimpleMath {
  public Double sum(Double numberOne, Double numberTwo) {

    return numberOne + numberTwo;
  }

  public Double sub(Double numberOne, Double numberTwo) {

    return numberOne - numberTwo;
  }

  public Double mult(Double numberOne,
      Double numberTwo) {

    return numberOne * numberTwo;
  }

  public Double raiz(Double numberOne) {

    Double numero = Math.sqrt(numberOne);

    return numero;
  }

  public Double media(Double numberOne, Double numberTwo) {

    Double numero = (numberOne + numberTwo) / 2;

    return numero;
  }
}
