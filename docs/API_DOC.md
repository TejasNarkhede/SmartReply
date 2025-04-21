# SmartReply API Documentation

## Overview
The SmartReply API provides endpoints for generating AI-powered email responses using Google's Gemini AI model.

## Base URL
```
http://localhost:8080/api
```

## Authentication
Currently, the API does not require authentication for local development. For production, API key authentication will be implemented.

## Endpoints

### Generate Email Reply
```
POST /email/reply
```

#### Request
```json
{
  "emailContent": "string",
  "tone": "string" // optional values: "professional", "casual", "friendly"
}
```

#### Response
```json
{
  "reply": "string"
}
```

#### Example
```bash
curl -X POST http://localhost:8080/api/email/reply \
  -H "Content-Type: application/json" \
  -d '{
    "emailContent": "Hello, I would like to schedule a meeting next week.",
    "tone": "professional"
  }'
```

## Request Format
- Content-Type: application/json
- All requests must be in JSON format
- Required fields must be included in the request body

## Response Format
- Content-Type: application/json
- Standard HTTP status codes
- Error responses include detailed messages

## Error Handling

### Error Response Format
```json
{
  "error": "string"
}
```

### Common Error Codes
- 400: Bad Request
- 500: Internal Server Error

