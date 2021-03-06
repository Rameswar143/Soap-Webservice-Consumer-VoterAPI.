package vs.online.voterservice.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.10
 * 2017-03-12T15:29:50.108+05:30
 * Generated source version: 3.1.10
 * 
 */
@WebService(targetNamespace = "http://www.online.vs/VoterService/", name = "OnlineVoterService")
@XmlSeeAlso({vs.online.voterservice.types.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface OnlineVoterService {

    @WebMethod
    @WebResult(name = "User", targetNamespace = "http://www.online.vs/VoterService/types", partName = "output")
    public vs.online.voterservice.types.User getVoteDetailsByVoterId(
        @WebParam(partName = "input", name = "voterId", targetNamespace = "http://www.online.vs/VoterService/types")
        java.lang.String input
    );

    @WebMethod
    @WebResult(name = "ActivityResponse", targetNamespace = "http://www.online.vs/VoterService/types", partName = "output")
    public vs.online.voterservice.types.ActivityResponse getVoteActivity(
        @WebParam(partName = "input", name = "voterType", targetNamespace = "http://www.online.vs/VoterService/types")
        java.lang.String input
    );

    @WebMethod
    @WebResult(name = "VoterResponse", targetNamespace = "http://www.online.vs/VoterService/types", partName = "output")
    public vs.online.voterservice.types.VoterResponse addVote(
        @WebParam(partName = "input", name = "VoterInfo", targetNamespace = "http://www.online.vs/VoterService/types")
        vs.online.voterservice.types.VoterInfo input
    ) throws ServiceActivityException;
}
