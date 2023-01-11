/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ke.co.mspace.nonsmppmanager.navigator;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import ke.co.mspace.nonsmppmanager.facepainter.Facepainter;



/**
 *
 * @author developer
 */
@ManagedBean(name="navigator")
public class Navigator implements Serializable{
    @ManagedProperty(value = "#{facePainter}")
    private Facepainter facePainter;

    public Facepainter getFacePainter() {
        return facePainter;
    }

    public void setFacePainter(Facepainter facePainter) {
        this.facePainter = facePainter;
    }
    
    public void addSmsUser(){
        facePainter.setPage("/AddSmsUser.xhtml");
    };
    public void addEmailUser(){
        facePainter.setPage("/AddEmailUser.xhtml");
    };
    public void viewEmailUser(){
        facePainter.setPage("/ViewEmailUsers.xhtml");
    };
    public String viewSmsUser(){
        return "ViewSmsUser.xhtml";
    };
    public String viewAlphanumerics(){
        return "ViewAlphanumerics.xhtml";
    };
    public String addResellers(){
        return "AddResellers.xhtml";
    };
    public String manageResellers(){
        return "ManageResellers.xhtml";
    };
    public String addPaybill(){
        return "AddPaybill.xhtml";
    };
    public String viewPaybill(){
        return "ViewPaybill.xhtml";
    };
    public String addCallback(){
        return "AddCallback.xhtml";
    };
    public String viewCallback(){
        return "ViewCallback.xhtml";
    };
    public String smsOutReport(){
        return "SmsOutReport.xhtml";
    };
    public String bulkReports(){
        return "BulkReports.xhtml";
    };
    public String smppReport(){
        return "SmppReport.xhtml";
    };
    public String optOutReport(){
        return "Optout.xhtml";
    };
    public String creditHistoryReport(){
        return "CreditHistoryReport.xhtml";
    };
    public String singleUserVisualReport(){
        return "SingleUserVisualReport.xhtml";
    };
    public String allUserVisualReport(){
        return "AllUserVisualReport.xhtml";
    };
}
