package rtp.message.model.serde;

import java.util.Map;

import org.apache.kafka.common.serialization.Deserializer;

import com.fasterxml.jackson.databind.ObjectMapper;

public class FIToFICustomerCreditTransferV06Deserializer implements Deserializer {

	@Override
	public void close() {
	}

	@Override
	public void configure(Map arg0, boolean arg1) {
	}

	@Override
	public Object deserialize(String arg0, byte[] arg1) {
		ObjectMapper mapper = new ObjectMapper();
		FIToFICustomerCreditTransferV06Deserializer message = null;
		try {
			message = mapper.readValue(arg1, FIToFICustomerCreditTransferV06Deserializer.class);
		} catch (Exception e) {

			e.printStackTrace();
		}
		return message;
	}

}
