package com.company.library.entity.test;

import com.company.library.entity.Town;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import java.util.UUID;

@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "DTYPE", discriminatorType = DiscriminatorType.STRING)
@Table(name = "LIBRARY_BASE_TEST_ENTITY")
@Entity(name = "library_BaseTestEntity")
public class BaseTestEntity extends StandardEntity {
    private static final long serialVersionUID = 6271222863963064786L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TOWN_ID")
    protected Town town;

    @Column(name = "TOWN_ID", insertable = false, updatable = false)
    protected UUID townId;

    public Town getTown() {
        return town;
    }

    public void setTown(Town town) {
        this.town = town;
    }

    public UUID getTownId() {
        return townId;
    }

    public void setTownId(UUID townId) {
        this.townId = townId;
    }

}