# SmartReply - AI-Powered Email Reply Assistant

## Project Description
SmartReply is a smart email assistant that helps users craft better email responses using AI. It provides both a web interface and a Chrome extension for Gmail integration, powered by Google's Gemini AI model.

## Demo / Screenshots
[Add screenshots/demo GIFs here]

## Key Features
- AI-powered email response generation
- Web-based interface for easy access
- Chrome extension for Gmail integration
- Custom tone reply generation
    - Professional
    - Casual
    - Friendly
- Copy to clipboard functionality
- Real-time response generation

## Tech Stack
- **Backend**: 
  - Spring Boot
  - Spring AI (Gemini API)
  - REST API
- **Frontend**: 
  - React
  - Vite
  - Material UI (MUI)
  - Axios for API calls
- **Extension**: 
  - Chrome Extension
  - Gmail Integration
  - Content Script Injection
- **AI**: Google Gemini API

## Architecture Overview

### Backend
- Spring Boot REST API
- Gemini AI integration
- CORS configuration
- Error handling

### Frontend
- React-based web interface
- Material UI components
- Modern UI/UX design
- API integration using Axios
- Responsive layout
- Error handling and loading states

### Chrome Extension
- Seamless Gmail integration
- One-click AI reply generation
- Automatic email content extraction
- Direct reply insertion in Gmail compose window
- Error handling and user feedback

## Installation and Setup
For detailed setup instructions, please refer to [INSTALLATION_AND_SETUP.md](docs/INSTALLATION_AND_SETUP.md)

## Usage Instructions

### Web Interface
1. Open the web application
2. Enter the email content you want to reply to
3. Select a tone (optional)
4. Click "Generate Reply"
5. Review the generated response
6. Use the "Copy to Clipboard" button to copy the response

### Chrome Extension
1. Install the Chrome extension
2. Open Gmail
3. Open an email you want to reply to
4. Click the "AI Reply" button in the compose toolbar
5. The AI-generated reply will be automatically inserted
6. Review and edit the response as needed
7. Send your email

## API Documentation
For detailed API documentation, please refer to [API_DOC.md](docs/API_DOC.md)

## Contributing
We welcome contributions! Please read our [CONTRIBUTING.md](docs/CONTRIBUTING.md) for guidelines.

## Author / Contact Info
[Add your contact information here] 