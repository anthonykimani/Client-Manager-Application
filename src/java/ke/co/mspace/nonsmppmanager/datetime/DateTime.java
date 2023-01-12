/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ke.co.mspace.nonsmppmanager.datetime;

import java.time.Year;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author developer
 */
@ManagedBean(name="datetime")
public class DateTime {
    Year year = Year.now();
    
    public Year getYear(){
        System.out.println(year);
        return year;
    }
    
}
