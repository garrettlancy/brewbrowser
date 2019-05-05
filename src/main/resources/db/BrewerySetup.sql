CREATE TABLE IF NOT EXISTS breweries(
  brewery_id varchar(250) NOT NULL,
  name varchar(250) NOT NULL,
  description varchar(250) NOT NULL,
  website varchar(250) NOT NULL,
  icon varchar(250) NOT NULL,
  image varchar(250) NOT NULL,
  primary key(brewery_id)
);

CREATE TABLE IF NOT EXISTS beers(
  beer_id varchar(250) NOT NULL,
  name varchar(250) NOT NULL,
  abv varchar(250) NOT NULL,
  style_name varchar(250) NOT NULL,
  style_description varchar(250) NOT NULL,
  label_icon varchar(250) NOT NULL,
  label_image varchar(250) NOT NULL,
  primary key(beer_id)
);

CREATE TABLE IF NOT EXISTS brewery_locations(
  location_id varchar(250) NOT NULL,
  street_address varchar(250) NOT NULL,
  locality varchar(250) NOT NULL,
  region varchar(250) NOT NULL,
  postal_code varchar(250) NOT NULL,
  phone varchar(250) NOT NULL,
  website varchar(250) NOT NULL,
  latitude decimal(10, 8) NOT NULL,
  longitude decimal(11, 8) NOT NULL,
  primary key(location_id)
);

CREATE TABLE IF NOT EXISTS brewery_beers(
  brewery_id varchar(250) NOT NULL,
  beer_id varchar(250) NOT NULL,
  constraint beer_id PRIMARY KEY(brewery_id, beer_id)
);

CREATE TABLE IF NOT EXISTS locations(
  brewery_id varchar(250) NOT NULL,
  location_id varchar(250) NOT NULL,
  constraint location_id PRIMARY KEY(brewery_id, location_id)
);
