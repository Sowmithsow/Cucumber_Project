FROM maven:3.9.9-eclipse-temurin-21

WORKDIR /app
COPY . .

RUN apt-get update && apt-get install -y \
    wget unzip curl gnupg \
    fonts-liberation \
    libasound2 \
    libatk-bridge2.0-0 \
    libatk1.0-0 \
    libcups2 \
    libdbus-1-3 \
    libgdk-pixbuf2.0-0 \
    libnspr4 \
    libnss3 \
    libx11-xcb1 \
    libxcomposite1 \
    libxdamage1 \
    libxrandr2 \
    xdg-utils \
    libgbm1 \
    libxshmfence1 \
    && wget https://dl.google.com/linux/direct/google-chrome-stable_current_amd64.deb \
    && apt install -y ./google-chrome-stable_current_amd64.deb

ENV SE_MANAGER_DRIVER_TIMEOUT=60

RUN mvn clean install -DskipTests

CMD ["mvn","-Dtest=Runner.Runnerclass","test"]
