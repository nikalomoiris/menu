package com.kalomoiris.menu.item;

import org.springframework.data.repository.CrudRepository;

public interface InMemoryItemRepository extends CrudRepository<Item, Long> {
}
