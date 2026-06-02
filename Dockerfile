FROM maven:3.9.9-eclipse-temurin-21

WORKDIR /app
COPY . .

# Install Chromium properly
RUN apt-get update && apt-get install -y \
    chromium \
    chromium-driver \
    chromium-common \
    chromium-sandbox \
    libglib2.0-0 \
    libnss3 \
    libgconf-2-4 \
    libfontconfig1 \
    libx11-xcb1 \
    libxcomposite1 \
    libxdamage1 \
    libxrandr2 \
    libgbm1 \
    libasound2 \
    libatk1.0-0 \
    libatk-bridge2.0-0 \
    libcups2 \
    libdbus-1-3 \
    wget unzip curl \
    && rm -rf /var/lib/apt/lists/*


RUN which chromium
RUN which chromedriver

ENV CHROME_BIN=/usr/bin/chromium
ENV WEBDRIVER_CHROME_DRIVER=/usr/bin/chromedriver

RUN mvn clean install -DskipTests

CMD ["mvn","-Dtest=Runner.Runnerclass","test"]
