# confluent-spring-healthcare-coverage-demo

Generates a stream of JSON-formatted hypothetical illnesses to the `ailments` topic, e.g.

    [root@cp01 ~]# kafka-console-consumer --bootstrap-server cp01.woolford.io:9092 --topic ailment
    {"id":40,"ailment":"myocardial infarction"}
    {"id":111,"ailment":"pertussis"}
    {"id":73,"ailment":"xenophobia"}
    {"id":32,"ailment":"myocardial infarction"}
    {"id":37,"ailment":"malaria"}
    {"id":28,"ailment":"hepatitis"}
    {"id":28,"ailment":"trichophagia"}
    {"id":88,"ailment":"hepatitis"}
    {"id":18,"ailment":"broken arm"}
    {"id":96,"ailment":"bordetella"}
    {"id":34,"ailment":"ingrown toenail"}
    {"id":25,"ailment":"broken leg"}
    ^CProcessed a total of 12 messages

The `id` is a unique identifier for the patient. The patients and ailments are generated from data that's staged in MySQL. The tables are automatically created, using Flyway, when the app is launched.
