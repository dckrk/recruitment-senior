## Description
Please create air search microservice
1. Design API
2. Gather date from sources and combine into response
3. Add support for discounts

### Assumptions
* There might be a lot of available flight options even for a single day
* There are different cabin types available for a flight
* Price depends on cabin class, therefore single flight can have more than one price


* Single discount can apply to more than one flight


###Request should contain following parameters
* String origin,
* String destination, 
* LocalDate day