# Spring Batch Metrics with Prometheus

Since version 4.2, Spring Batch provides support for batch monitoring and metrics based on Micrometer.


## Description
### Dependency
- org.springframework.boot
  - `spring-boot-starter-batch`
  - `spring-boot-starter-actuator`
- io.micrometer
  - `micrometer-registry-prometheus`
- io.prometheus
  - `simpleclient_pushgateway`

### Prometheus Gateway
Use it as Docker

```shell script
$ docker pull prom/pushgateway
$ docker run --rm -d -p 9091:9091 prom/pushgateway
```

## Demo
### Run Spring Batch
```shell script
$ ./gradlew clean bootRun
```

### Display Metrics on Prometheus Gateway
- [http://localhost:9091](http://localhost:9091)
- [http://localhost:9091/metrics](http://localhost:9091/metrics)
  - Metrics for Prometheus

![image](https://user-images.githubusercontent.com/3072734/111860209-643a4f80-8989-11eb-9b1e-cb2dc2c6eae3.png)

### Display Metrics on Prometheus
- [http://localhost:9090](http://localhost:9090)

### Display Metrics on Grafana
- [http://localhost:3000](http://localhost:3000)
  - Username: `admin`
  - Password: `admin`
  - Data Source
    - URL: `http://localhost:9090`
    - Access: `Browser`

![image](https://user-images.githubusercontent.com/3072734/111861755-02331780-8994-11eb-8ceb-0d11435d5b33.png)


## Features

- feature:1
- feature:2

## Requirement

## Usage

## Installation

## References

- [Monitoring and metrics](https://docs.spring.io/spring-batch/docs/current/reference/html/monitoring-and-metrics.html)
- [Prometheus Pushgateway](https://github.com/prometheus/pushgateway)

## Licence

Released under the [MIT license](https://gist.githubusercontent.com/shinyay/56e54ee4c0e22db8211e05e70a63247e/raw/34c6fdd50d54aa8e23560c296424aeb61599aa71/LICENSE)

## Author

[shinyay](https://github.com/shinyay)
