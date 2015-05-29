package com.tdc.util;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.springframework.stereotype.Component;

import com.tdc.component.bean.ResultSO;

/**
 * Created by IntelliJ IDEA.
 * User: m29981
 * Date: Jun 27, 2012
 * Time: 1:23:46 PM
 * To change this template use File | Settings | File Templates.
 */
@Component
@XmlRootElement
@JsonSerialize(include= JsonSerialize.Inclusion.NON_DEFAULT)
public class DroolsAuthorizationReply implements Serializable {

    private static final long serialVersionUID = 0L;
    /**
     * @author m29981
     *
     */
    private ResultSO resultSO;

    @XmlElement
    public ResultSO getResultSO () {
         return resultSO;
    }
    public void setResultSO (ResultSO resultSO) {
         this.resultSO= resultSO;
    }
}
