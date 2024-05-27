package pt.hip.soap;

import jakarta.jws.WebService;
import java.text.ParseException;

@WebService
public interface HL7Service {

    String getPatientId (String exchange);
    String getPatientAdministrativeSex (String exchange);
    String getMSHDate (String exchange) throws ParseException;
}