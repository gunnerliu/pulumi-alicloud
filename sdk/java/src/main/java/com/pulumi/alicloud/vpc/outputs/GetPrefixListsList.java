// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.vpc.outputs;

import com.pulumi.alicloud.vpc.outputs.GetPrefixListsListEntry;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetPrefixListsList {
    /**
     * @return The time when the prefix list was created.
     * 
     */
    private String createTime;
    /**
     * @return The CIDR address block list of the prefix list.
     * 
     */
    private List<GetPrefixListsListEntry> entrys;
    /**
     * @return The ID of the Prefix List.
     * 
     */
    private String id;
    /**
     * @return The IP version of the prefix list.
     * 
     */
    private String ipVersion;
    /**
     * @return The maximum number of entries for CIDR address blocks in the prefix list.
     * 
     */
    private Integer maxEntries;
    /**
     * @return The description of the prefix list.
     * 
     */
    private String prefixListDescription;
    /**
     * @return The ID of the query Prefix List.
     * 
     */
    private String prefixListId;
    /**
     * @return The name of the prefix list.
     * 
     */
    private String prefixListName;
    /**
     * @return The share type of the prefix list.
     * 
     */
    private String shareType;

    private GetPrefixListsList() {}
    /**
     * @return The time when the prefix list was created.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return The CIDR address block list of the prefix list.
     * 
     */
    public List<GetPrefixListsListEntry> entrys() {
        return this.entrys;
    }
    /**
     * @return The ID of the Prefix List.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The IP version of the prefix list.
     * 
     */
    public String ipVersion() {
        return this.ipVersion;
    }
    /**
     * @return The maximum number of entries for CIDR address blocks in the prefix list.
     * 
     */
    public Integer maxEntries() {
        return this.maxEntries;
    }
    /**
     * @return The description of the prefix list.
     * 
     */
    public String prefixListDescription() {
        return this.prefixListDescription;
    }
    /**
     * @return The ID of the query Prefix List.
     * 
     */
    public String prefixListId() {
        return this.prefixListId;
    }
    /**
     * @return The name of the prefix list.
     * 
     */
    public String prefixListName() {
        return this.prefixListName;
    }
    /**
     * @return The share type of the prefix list.
     * 
     */
    public String shareType() {
        return this.shareType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPrefixListsList defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String createTime;
        private List<GetPrefixListsListEntry> entrys;
        private String id;
        private String ipVersion;
        private Integer maxEntries;
        private String prefixListDescription;
        private String prefixListId;
        private String prefixListName;
        private String shareType;
        public Builder() {}
        public Builder(GetPrefixListsList defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.entrys = defaults.entrys;
    	      this.id = defaults.id;
    	      this.ipVersion = defaults.ipVersion;
    	      this.maxEntries = defaults.maxEntries;
    	      this.prefixListDescription = defaults.prefixListDescription;
    	      this.prefixListId = defaults.prefixListId;
    	      this.prefixListName = defaults.prefixListName;
    	      this.shareType = defaults.shareType;
        }

        @CustomType.Setter
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        @CustomType.Setter
        public Builder entrys(List<GetPrefixListsListEntry> entrys) {
            this.entrys = Objects.requireNonNull(entrys);
            return this;
        }
        public Builder entrys(GetPrefixListsListEntry... entrys) {
            return entrys(List.of(entrys));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder ipVersion(String ipVersion) {
            this.ipVersion = Objects.requireNonNull(ipVersion);
            return this;
        }
        @CustomType.Setter
        public Builder maxEntries(Integer maxEntries) {
            this.maxEntries = Objects.requireNonNull(maxEntries);
            return this;
        }
        @CustomType.Setter
        public Builder prefixListDescription(String prefixListDescription) {
            this.prefixListDescription = Objects.requireNonNull(prefixListDescription);
            return this;
        }
        @CustomType.Setter
        public Builder prefixListId(String prefixListId) {
            this.prefixListId = Objects.requireNonNull(prefixListId);
            return this;
        }
        @CustomType.Setter
        public Builder prefixListName(String prefixListName) {
            this.prefixListName = Objects.requireNonNull(prefixListName);
            return this;
        }
        @CustomType.Setter
        public Builder shareType(String shareType) {
            this.shareType = Objects.requireNonNull(shareType);
            return this;
        }
        public GetPrefixListsList build() {
            final var _resultValue = new GetPrefixListsList();
            _resultValue.createTime = createTime;
            _resultValue.entrys = entrys;
            _resultValue.id = id;
            _resultValue.ipVersion = ipVersion;
            _resultValue.maxEntries = maxEntries;
            _resultValue.prefixListDescription = prefixListDescription;
            _resultValue.prefixListId = prefixListId;
            _resultValue.prefixListName = prefixListName;
            _resultValue.shareType = shareType;
            return _resultValue;
        }
    }
}
