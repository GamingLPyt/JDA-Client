# JDA-Client
JDA-Client is an updated Version from [DV8FromTheWorld/JDA-Client](https://github.com/DV8FromTheWorld/JDA-Client/)
<br><br>
## What can you do with this API?
With this API you can look up a specific user, 
for example you can get their Discord#Tag, Creation date, 
or Avatar url
<br>
You can try it [here](https://www.waveguard.dev:8082/discord/user?id=331080562238423040)
<br><br>
## How to use this API?
```java
JDAClientBuilder jdaClientBuilder = new JDAClientBuilder().setToken("Your User Token");
JDAClient jdaClient = jdaClientBuilder.buildSelfUser();
```
```java
JDAClientBuilder jdaClientBuilder = new JDAClientBuilder().setToken("Your User Token").setId("User ID, from the User you want");
JDAClient jdaClient = jdaClientBuilder.buildUser();
```
```java
JDAClientBuilder jdaClientBuilder = new JDAClientBuilder().setToken("Your User Token").setId("User ID, from the User you want");
JDAClient jdaClientSelf = jdaClientBuilder.buildSelfUser();
JDAClient jdaClient = jdaClientBuilder.buildUser();
```

### How to get your Discord Token
First start your Discord App and press CONTROL + SHIFT + i,<br>
Now it will open the Discord integrated "Code Lookup",<br>
Navigate to "Application" >> "Local Storage" >> "https://discord.com", you will see this:
<br><br>
![Code Lookup](https://www.waveguard.dev/discord/jda-client/Code-Lookup.png)
<br><br><br>
Search for your Discord Token, by entering in Filter "token",<br>
Press CONTROL + r, to reload Discord.<br>
Now you will see this:
<br><br>
![Token Lookup](https://www.waveguard.dev/discord/jda-client/Lookup-Token.png)
<br><br><br>
Now copy the Value of your "token" and insert into the JDAClientBuilder().setToken("Your User Token");
