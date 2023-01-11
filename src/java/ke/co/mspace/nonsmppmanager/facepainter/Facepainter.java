/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ke.co.mspace.nonsmppmanager.facepainter;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author developer
 */
@ManagedBean(name="facePainter")
public class Facepainter implements Serializable {
    private String page = "/ViewEmailUsers.xhtml";
    
    public Facepainter(){
        
    }
    
    public String getPage(){
        return page;
    }
    
    public void setPage(String page){
//        System.out.println(page);
        this.page = page;
    }
        
    
}
