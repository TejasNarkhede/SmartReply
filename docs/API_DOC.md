# SmartReply API Documentation

## Overview
The SmartReply API provides endpoints for generating AI-powered email responses using Google's Gemini AI model.

## Base URL
```
http://localhost:8080/api/v1
```

## Authentication
Currently, the API does not require authentication for local development. For production, API key authentication will be implemented.

## Endpoints

### Generate AI Reply
```
POST /generate-reply
```

#### Request
```json
{
  "emailContent": "string",
  "context": "string",
  "tone": "string" // optional
}
```

#### Response
```json
{
  "reply": "string",
  "confidence": "number",
  "timestamp": "string"
}
```

#### Example
```bash
curl -X POST http://localhost:8080/api/v1/generate-reply \
  -H "Content-Type: application/json" \
  -d '{
    "emailContent": "Hello, I would like to schedule a meeting next week.",
    "context": "business",
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
  "status": "error",
  "message": "string",
  "code": "number",
  "timestamp": "string"
}
```

### Common Error Codes
- 400: Bad Request
- 401: Unauthorized
- 403: Forbidden
- 404: Not Found
- 429: Too Many Requests (Rate limit exceeded)
- 500: Internal Server Error

