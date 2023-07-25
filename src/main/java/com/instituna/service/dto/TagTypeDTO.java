package com.instituna.service.dto;

import jakarta.validation.constraints.*;
import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

/**
 * A DTO for the {@link com.instituna.domain.TagType} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class TagTypeDTO implements Serializable {

    private Long id;

    private Long createdBy;

    private Instant createdOn;

    private Long updatedBy;

    private Instant updatedOn;

    private Long deletedBy;

    private Instant deletedOn;

    @NotNull(message = "must not be null")
    private String description;

    private Boolean restricted;

    private TagDTO defaultTag;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Instant getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Instant createdOn) {
        this.createdOn = createdOn;
    }

    public Long getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Long updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Instant getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Instant updatedOn) {
        this.updatedOn = updatedOn;
    }

    public Long getDeletedBy() {
        return deletedBy;
    }

    public void setDeletedBy(Long deletedBy) {
        this.deletedBy = deletedBy;
    }

    public Instant getDeletedOn() {
        return deletedOn;
    }

    public void setDeletedOn(Instant deletedOn) {
        this.deletedOn = deletedOn;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getRestricted() {
        return restricted;
    }

    public void setRestricted(Boolean restricted) {
        this.restricted = restricted;
    }

    public TagDTO getDefaultTag() {
        return defaultTag;
    }

    public void setDefaultTag(TagDTO defaultTag) {
        this.defaultTag = defaultTag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TagTypeDTO)) {
            return false;
        }

        TagTypeDTO tagTypeDTO = (TagTypeDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, tagTypeDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "TagTypeDTO{" +
            "id=" + getId() +
            ", createdBy=" + getCreatedBy() +
            ", createdOn='" + getCreatedOn() + "'" +
            ", updatedBy=" + getUpdatedBy() +
            ", updatedOn='" + getUpdatedOn() + "'" +
            ", deletedBy=" + getDeletedBy() +
            ", deletedOn='" + getDeletedOn() + "'" +
            ", description='" + getDescription() + "'" +
            ", restricted='" + getRestricted() + "'" +
            ", defaultTag=" + getDefaultTag() +
            "}";
    }
}
