/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lession10;

/**
 *
 * @author ADMIN
 */
public class ConversionUtil {
    double fahrenheitToCelsius(double fDegree){
        return 5*(fDegree-32)/9;
    }
    double celciusToFahrenheit(double  cDegree){
        return (9*cDegree/5)+32;
    }
}
