// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cloudfirewall.outputs;

import com.pulumi.alicloud.cloudfirewall.outputs.GetAddressBooksBookEcsTag;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetAddressBooksBook {
    /**
     * @return The addresses in the Address Book.
     * 
     */
    private final List<String> addressLists;
    /**
     * @return Whether you want to automatically add new matching tags of the ECS IP address to the Address Book.
     * 
     */
    private final Integer autoAddTagEcs;
    /**
     * @return The description of the Address Book.
     * 
     */
    private final String description;
    /**
     * @return The logical relation among the ECS tags that to be matchedh.
     * 
     */
    private final @Nullable List<GetAddressBooksBookEcsTag> ecsTags;
    /**
     * @return The name of the Address Book.
     * 
     */
    private final String groupName;
    /**
     * @return The type of the Address Book.
     * 
     */
    private final String groupType;
    /**
     * @return The ID of the Address Book.
     * 
     */
    private final String groupUuid;
    /**
     * @return The ID of the Address Book.
     * 
     */
    private final String id;
    /**
     * @return One or more tags for the relationship between.
     * 
     */
    private final String tagRelation;

    @CustomType.Constructor
    private GetAddressBooksBook(
        @CustomType.Parameter("addressLists") List<String> addressLists,
        @CustomType.Parameter("autoAddTagEcs") Integer autoAddTagEcs,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("ecsTags") @Nullable List<GetAddressBooksBookEcsTag> ecsTags,
        @CustomType.Parameter("groupName") String groupName,
        @CustomType.Parameter("groupType") String groupType,
        @CustomType.Parameter("groupUuid") String groupUuid,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("tagRelation") String tagRelation) {
        this.addressLists = addressLists;
        this.autoAddTagEcs = autoAddTagEcs;
        this.description = description;
        this.ecsTags = ecsTags;
        this.groupName = groupName;
        this.groupType = groupType;
        this.groupUuid = groupUuid;
        this.id = id;
        this.tagRelation = tagRelation;
    }

    /**
     * @return The addresses in the Address Book.
     * 
     */
    public List<String> addressLists() {
        return this.addressLists;
    }
    /**
     * @return Whether you want to automatically add new matching tags of the ECS IP address to the Address Book.
     * 
     */
    public Integer autoAddTagEcs() {
        return this.autoAddTagEcs;
    }
    /**
     * @return The description of the Address Book.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The logical relation among the ECS tags that to be matchedh.
     * 
     */
    public List<GetAddressBooksBookEcsTag> ecsTags() {
        return this.ecsTags == null ? List.of() : this.ecsTags;
    }
    /**
     * @return The name of the Address Book.
     * 
     */
    public String groupName() {
        return this.groupName;
    }
    /**
     * @return The type of the Address Book.
     * 
     */
    public String groupType() {
        return this.groupType;
    }
    /**
     * @return The ID of the Address Book.
     * 
     */
    public String groupUuid() {
        return this.groupUuid;
    }
    /**
     * @return The ID of the Address Book.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return One or more tags for the relationship between.
     * 
     */
    public String tagRelation() {
        return this.tagRelation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAddressBooksBook defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> addressLists;
        private Integer autoAddTagEcs;
        private String description;
        private @Nullable List<GetAddressBooksBookEcsTag> ecsTags;
        private String groupName;
        private String groupType;
        private String groupUuid;
        private String id;
        private String tagRelation;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAddressBooksBook defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressLists = defaults.addressLists;
    	      this.autoAddTagEcs = defaults.autoAddTagEcs;
    	      this.description = defaults.description;
    	      this.ecsTags = defaults.ecsTags;
    	      this.groupName = defaults.groupName;
    	      this.groupType = defaults.groupType;
    	      this.groupUuid = defaults.groupUuid;
    	      this.id = defaults.id;
    	      this.tagRelation = defaults.tagRelation;
        }

        public Builder addressLists(List<String> addressLists) {
            this.addressLists = Objects.requireNonNull(addressLists);
            return this;
        }
        public Builder addressLists(String... addressLists) {
            return addressLists(List.of(addressLists));
        }
        public Builder autoAddTagEcs(Integer autoAddTagEcs) {
            this.autoAddTagEcs = Objects.requireNonNull(autoAddTagEcs);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder ecsTags(@Nullable List<GetAddressBooksBookEcsTag> ecsTags) {
            this.ecsTags = ecsTags;
            return this;
        }
        public Builder ecsTags(GetAddressBooksBookEcsTag... ecsTags) {
            return ecsTags(List.of(ecsTags));
        }
        public Builder groupName(String groupName) {
            this.groupName = Objects.requireNonNull(groupName);
            return this;
        }
        public Builder groupType(String groupType) {
            this.groupType = Objects.requireNonNull(groupType);
            return this;
        }
        public Builder groupUuid(String groupUuid) {
            this.groupUuid = Objects.requireNonNull(groupUuid);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder tagRelation(String tagRelation) {
            this.tagRelation = Objects.requireNonNull(tagRelation);
            return this;
        }        public GetAddressBooksBook build() {
            return new GetAddressBooksBook(addressLists, autoAddTagEcs, description, ecsTags, groupName, groupType, groupUuid, id, tagRelation);
        }
    }
}
