--insert category
--insert into catalog_category (id, slug, version) values ('1111-0001', 'cup', 0);
--insert into common_localized_String (id, language, text) values ('1111-1111-0001', 'en', 'cup');
--insert into common_localized_String (id, language, text) values ('1111-1111-0002', 'zh', '杯子');
--insert into common_localized_String (id, language, text) values ('1111-2222-0001', 'en', 'this is cup category')
--insert into common_localized_String (id, language, text) values ('1111-2222-0002', 'zh', '这是杯子类目')
--insert into catalog_category_name (category_entity_id,name_id) values ('1111-0001', '1111-1111-0001');
--insert into catalog_category_name (category_entity_id,name_id) values ('1111-0001', '1111-1111-0002');
--insert into catalog_category_description (category_entity_id,description_id) values ('1111-0001', '1111-2222-0001');
--insert into catalog_category_description (category_entity_id,description_id) values ('1111-0001', '1111-2222-0002');


--insert product type
--insert into catalog_product_type (id, version, name, description) values ('2222-0001', 0, "cup type", 'this is cup type');
--insert into catalog_product_type_attribute_definition (id, type, name, required, attributeConstraint, inputHint, searchable)
--values ('2222-1111-0001', '', 'color', true, )

--insert product