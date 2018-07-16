PaginaWeb: código da página web.
Grande parte do código foi inspirado no artigo de Alvaro Viebrantz. Link aqui: https://medium.com/iot-bootcamp/sensoriamento-realtime-com-firebase-e-esp8266-6e54b9bff1c1.

RelogioFISL18: projeto Android para o Wear. Na palestra demonstrei com um Samsung Gear.

nodemcu: código para o NodeMCU.

arduino_uno_johnnyfive.js: código para o Arduino Uno.

O projeto usa o Realtime Database e o Hosting do Firebase. O banco é compartilhado entre uma aplicação para relógio, uma página web, um sketch para Arduino e outro para NodeMCU. Dessa forma, com o relógio ou com a página web pode-se controlar o LED e a lâmpada. Além de poder ver os dados do sensor DHT11 (temperatura e umidade). 
