CREATE TABLE all_signals (
    s_id INT PRIMARY KEY AUTO_INCREMENT,
    s_date TIMESTAMP,
    s_time_frame VARCHAR(20),
    s_method_type VARCHAR(20),
    s_type_operation VARCHAR(20),
    s_currency_name VARCHAR(20),
    s_currency_value FLOAT
);

ALTER TABLE all_signals comment = 'Все сигналы';
