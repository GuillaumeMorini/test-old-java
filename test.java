Map<String, Double> maksimum = new HashMap<>();
List<Record> records;
for (Record record : records) {
    record.getFeatures().forEach((key, value) -> {
        maksimum.compute(key, (k1, max) -> max == null || value > max ? value : max);
    });
}
