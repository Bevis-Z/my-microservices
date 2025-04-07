package com.example.aiservice.services;

import com.azure.ai.openai.OpenAIClient;
import com.azure.ai.openai.OpenAIClientBuilder;
import com.azure.ai.openai.models.ChatCompletionsOptions;
import com.azure.ai.openai.models.ChatRequestMessage;
import com.azure.ai.openai.models.ChatRequestSystemMessage;
import com.azure.core.credential.AzureKeyCredential;
import io.github.cdimascio.dotenv.Dotenv;
import com.example.aiservice.model.dto.ChatMessageRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AiConsultService {
    public String getConsult(ChatMessageRequest request) {

        Dotenv dotenv = Dotenv.configure().load();
        String apiKey = dotenv.get("AZURE_API_KEY");
        try {
            String prompt = "Analyze patient information: " + request.AllChatMessagesString;

            if (request.Diagnosis != null) {
                prompt += " with diagnosis: " + request.Diagnosis;
            }

            OpenAIClient client = new OpenAIClientBuilder()
                    .endpoint("https://dr2-ai.openai.azure.com")
                    .credential(new AzureKeyCredential(apiKey))
                    .buildClient();

            List<ChatRequestMessage> chatMessages = new ArrayList<>();
            chatMessages.add(new ChatRequestSystemMessage(prompt));

            ChatCompletionsOptions options = new ChatCompletionsOptions(chatMessages);
            String response = client.getChatCompletions("gpt-4o", options).getChoices().getFirst().getMessage().getContent();

            // Use client to make API calls
            // This is a placeholder - replace with actual API call
            return response;
            
        } catch (Exception e) {
            return "Error processing consultation: " + e.getMessage();
        }
    }
} 