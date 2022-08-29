# Step by Step Tutorial - TDD for Spring-Boot with Junit 5

## What is this repository for?
This repository is a collection of _copy-pasteable_ templates that you can use for test-driving Spring Boot Microservices.

This uses [Double loop TDD](https://coding-is-like-cooking.info/2013/04/outside-in-development-with-double-loop-tdd) so we start with writing a failing test at a higher level and go deeper writing more granular tests before writing code.

## How to use this repository?
You can either 
* clone this repository to your machine and _copy-paste_ the tests/code to use as templates OR
* follow all the steps in the following table one by one, clicking on the link to see the exact changes to be done in each step

## Step-by-step approach to develop a Microservice

Index: 🔴 = Failing |  ✅ = Passing

| Step                                                                          | File Changes                                                                                                              | Contract Test | Controller Test    | Service Test | Data Layer Test |
|-------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------|---------------|--------------------|-------------|---------------| 
| Step 1: Write a failing contract test                                         | [Link](https://github.com/techcoachcircle/tutorial-tdd-spring-boot-steps/commit/945f059c4690a17056add3f7ff84b31d89f766e1) | 🔴            | Not present        | Not present | Not present   |
| Step 2: Failing controller test                                               | [Link](https://github.com/techcoachcircle/tutorial-tdd-spring-boot-steps/commit/c57a0c81b097d22aea6d2c28ab4399f846b51b87) | 🔴            | 🔴                 | Not present | Not present   |
| Step 3: Passing controller test but failing contract test                     | [Link](https://github.com/techcoachcircle/tutorial-tdd-spring-boot-steps/commit/a7e9e1a219ba6dba3e086eef3f7a5971176efa42) | 🔴            | ✅                  | Not present | Not present   |
| Step 4: Failing service test with mocked repository(DAO)                      | [Link](https://github.com/techcoachcircle/tutorial-tdd-spring-boot-steps/commit/ab153bfba3589c3fcd79037c2b64a8e1617e49d7) | 🔴            | ✅                  | 🔴        | Not present   |
| Step 5: Passing service test but failing contract test                        | [Link](https://github.com/techcoachcircle/tutorial-tdd-spring-boot-steps/commit/ad790cec82c18d934394680267d774163ca2d693) | 🔴            | ✅                  | ✅        | Not present   |
| Step 6: Refactor `CarRepository` to interface that extends `CrudRepository`   | [Link](https://github.com/techcoachcircle/tutorial-tdd-spring-boot-steps/commit/4ce5aad121383646ba622824cc5590fa33bc18ad) | 🔴            | ✅                  | ✅        | Not present   | 
| Step 7: Failing repository's first test for autogeneration of `id`            | [Link](https://github.com/techcoachcircle/tutorial-tdd-spring-boot-steps/commit/1f2236a21e6b595e7a07558b5fb48d599090dd6d) | 🔴            | ✅                  | ✅        | 🔴           |
| Step 8: Passing repository's first Test for autogeneration of `id`            | [Link](https://github.com/techcoachcircle/tutorial-tdd-spring-boot-steps/commit/30726a91cee31b7f0ea61ea3c2cd1fc69c439f7e) | 🔴            | ✅                  | ✅        | ✅             |
| Step 9: Passing repository's test for findAll but still failing contract test | [Link](https://github.com/techcoachcircle/tutorial-tdd-spring-boot-steps/commit/74ac9e1525926ca474d8bf801cb84ebc4888b250) | 🔴            | ✅                  | ✅        | ✅             |
| Step 10: Passing the contract test (Finally)                                  | [Link](https://github.com/techcoachcircle/tutorial-tdd-spring-boot-steps/commit/5e4190fa2feca6ab5f6a22a9f9a9b26118f95b56) | ✅            | ✅                  | ✅        | ✅             |

## What is TDD? (If you dont know)
[Here](https://www.youtube.com/watch?v=BSaAMQVq01E&t=5811s) is a crisp video (short and very high level) by Bob Martin that explains what is TDD

# Credits
Inspired and adapted from https://github.com/mbhave/tdd-with-spring-boot/blob/master/non-reactive/pom.xml.
