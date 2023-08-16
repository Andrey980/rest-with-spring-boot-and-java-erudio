package br.com.erudio.restwithspringboot.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.erudio.restwithspringboot.converters.numberConverter;
import br.com.erudio.restwithspringboot.exceptions.UnsupportedMathOperation;
import br.com.erudio.restwithspringboot.math.SimpleMath;

@RestController
public class MathController {

  private SimpleMath math = new SimpleMath();

  @RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
  public Double sum(@PathVariable("numberOne") String numberOne,
      @PathVariable("numberTwo") String numberTwo) throws Exception {

    if (!numberConverter.isNumeric(numberOne) || !numberConverter.isNumeric(numberTwo)) {
      throw new UnsupportedMathOperation("Please set a numeric value!");
    }
    return math.sum(numberConverter.convertToDouble(numberOne), numberConverter.convertToDouble(numberTwo));
  }

  @RequestMapping(value = "/sub/{numberOne}/{numberTwo}", method = RequestMethod.GET)
  public Double sub(@PathVariable("numberOne") String numberOne,
      @PathVariable("numberTwo") String numberTwo) throws Exception {

    if (!numberConverter.isNumeric(numberOne) || !numberConverter.isNumeric(numberTwo)) {
      throw new UnsupportedMathOperation("Please set a numeric value!");
    }
    return math.sub(numberConverter.convertToDouble(numberOne), numberConverter.convertToDouble(numberTwo));
  }

  @RequestMapping(value = "/mult/{numberOne}/{numberTwo}", method = RequestMethod.GET)
  public Double mult(@PathVariable("numberOne") String numberOne,
      @PathVariable("numberTwo") String numberTwo) throws Exception {

    if (!numberConverter.isNumeric(numberOne) || !numberConverter.isNumeric(numberTwo)) {
      throw new UnsupportedMathOperation("Please set a numeric value!");
    }
    return math.mult(numberConverter.convertToDouble(numberOne), numberConverter.convertToDouble(numberTwo));
  }

  @RequestMapping(value = "/raiz/{numberOne}", method = RequestMethod.GET)
  public Double raiz(@PathVariable("numberOne") String numberOne) throws Exception {

    if (!numberConverter.isNumeric(numberOne)) {
      throw new UnsupportedMathOperation("Please set a numeric value!");
    }

    return math.raiz(numberConverter.convertToDouble(numberOne));
  }

  @RequestMapping(value = "/media/{numberOne}/{numberTwo}", method = RequestMethod.GET)
  public Double media(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo)
      throws Exception {

    if (!numberConverter.isNumeric(numberOne) || !numberConverter.isNumeric(numberTwo)) {
      throw new UnsupportedMathOperation("Please set a numeric value!");
    }

    return math.media(numberConverter.convertToDouble(numberOne), numberConverter.convertToDouble(numberTwo));
  }
}