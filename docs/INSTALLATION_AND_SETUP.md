# Installation and Setup Guide

## Prerequisites

### System Requirements
- Java 17 or higher
- Node.js 16 or higher
- npm 7 or higher
- Git

### Required Accounts
- Google Cloud Platform account (for Gemini API)
- GitHub account (for version control)

## Backend Setup

### 1. Clone the Repository
```bash
git clone https://github.com/yourusername/SmartReply.git
cd smart-reply-backend
```

### 2. Environment Variables
Create a `.env` file in the backend root directory by copying the example file:
```bash
cp .env.example .env
```

Then edit the `.env` file with your specific values:

```env
GEMINI_API_URL=your_api_url_here
GEMINI_API_KEY=your_api_key_here
```

Important: Never commit your `.env` file to version control. The `.env.example` file is provided as a template.

### 3. Install Dependencies
```bash
./mvnw clean install
```

### 4. Run the Backend
```bash
./mvnw spring-boot:run
```

## Frontend Setup

### 1. Navigate to Frontend Directory
```bash
cd ../smart-reply-frontend
```

### 2. Install Dependencies
```bash
npm install
```

### 3. Required Dependencies
The frontend uses the following key dependencies:
- @mui/material (Material UI)
- @emotion/react
- @emotion/styled
- axios
- react

### 4. Run the Frontend
```bash
npm run dev
```

## Chrome Extension Setup

### 1. Load the Extension
1. Open Chrome and navigate to `chrome://extensions/`
2. Enable "Developer mode" in the top right
3. Click "Load unpacked" and select the `smart-reply-extension` directory

## Running the Complete System

### 1. Start Backend
```bash
cd smart-reply-backend
./mvnw spring-boot:run
```

### 2. Start Frontend
```bash
cd ../smart-reply-frontend
npm run dev
```

## Common Issues & Fixes

### Backend Issues
1. **Port Already in Use**
   - Solution: Change `SERVER_PORT` in `.env` or kill the process using the port

2. **API Key Not Working**
   - Solution: Verify the API key in Google Cloud Console and update `.env`

3. **Environment Variables Not Loading**
   - Solution: Ensure `.env` file exists and contains all required variables
   - Check variable names match those in `.env.example`

### Frontend Issues
1. **API Connection Failed**
   - Solution: Verify backend is running and API URL is correct
   - Check CORS configuration in backend

2. **Material UI Components Not Loading**
   - Solution: Verify all MUI dependencies are installed correctly
   - Check for version conflicts

## Troubleshooting
For additional help:
1. Check the browser console for errors
2. Review backend logs
3. Verify all services are running
4. Ensure all environment variables are set correctly
5. Check `.env` files for typos or missing variables 