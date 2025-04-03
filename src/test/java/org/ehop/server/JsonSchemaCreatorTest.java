package org.ehop.server;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.jsonSchema.JsonSchema;
import com.fasterxml.jackson.module.jsonSchema.factories.SchemaFactoryWrapper;
import org.ehop.server.model.AccessCredential;
import org.ehop.server.model.AccessMethod;
import org.ehop.server.model.PaymentType;
import org.ehop.server.model.Benefit;
import org.junit.jupiter.api.Test;

import java.util.Map;

public class JsonSchemaCreatorTest {

    @Test
    void changeSchemaAndJsonCreator() {
        ObjectMapper objectMapper = new ObjectMapper();
        SchemaFactoryWrapper visitor = new SchemaFactoryWrapper();
        try {
            objectMapper.acceptJsonFormatVisitor(Benefit.class, visitor);
            JsonSchema jsonSchema = visitor.finalSchema();
            String schemaString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonSchema);
//            System.out.println(schemaString);

            Map<AccessMethod, AccessCredential> accessMethods = Map.of(AccessMethod.CHAT, new AccessCredential("chatId", "chatSecret"),
                    AccessMethod.AUDIO_CALL, new AccessCredential("voiceId", "voiceSecret"),
                    AccessMethod.FACE_TO_FACE, new AccessCredential("faceId", "faceSecret"));

            Map<PaymentType, Double> charges = Map.of(PaymentType.SUBSCRIPTION, 10.0,
                    PaymentType.PAY_AS_YOU_GO, 5.0);

            Benefit service = new Benefit("1", "Test Service", "This is a test service", "logo.png", accessMethods, charges);
            System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(service));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
