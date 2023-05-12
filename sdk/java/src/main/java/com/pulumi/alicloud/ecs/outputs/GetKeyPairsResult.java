// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs.outputs;

import com.pulumi.alicloud.ecs.outputs.GetKeyPairsKeyPair;
import com.pulumi.alicloud.ecs.outputs.GetKeyPairsPair;
import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetKeyPairsResult {
    /**
     * @return Finger print of the key pair.
     * 
     */
    private final @Nullable String fingerPrint;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final List<String> ids;
    /**
     * @return A list of key pairs. Each element contains the following attributes:
     * 
     * @deprecated
     * Field &#39;key_pairs&#39; has been deprecated from provider version 1.121.0. New field &#39;pairs&#39; instead.
     * 
     */
    @Deprecated /* Field 'key_pairs' has been deprecated from provider version 1.121.0. New field 'pairs' instead. */
    private final List<GetKeyPairsKeyPair> keyPairs;
    private final @Nullable String nameRegex;
    /**
     * @return A list of key pair names.
     * 
     */
    private final List<String> names;
    private final @Nullable String outputFile;
    private final List<GetKeyPairsPair> pairs;
    /**
     * @return The Id of resource group.
     * 
     */
    private final @Nullable String resourceGroupId;
    /**
     * @return (Optional, Available in v1.66.0+) A mapping of tags to assign to the resource.
     * 
     */
    private final @Nullable Map<String,Object> tags;

    @CustomType.Constructor
    private GetKeyPairsResult(
        @CustomType.Parameter("fingerPrint") @Nullable String fingerPrint,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ids") List<String> ids,
        @CustomType.Parameter("keyPairs") List<GetKeyPairsKeyPair> keyPairs,
        @CustomType.Parameter("nameRegex") @Nullable String nameRegex,
        @CustomType.Parameter("names") List<String> names,
        @CustomType.Parameter("outputFile") @Nullable String outputFile,
        @CustomType.Parameter("pairs") List<GetKeyPairsPair> pairs,
        @CustomType.Parameter("resourceGroupId") @Nullable String resourceGroupId,
        @CustomType.Parameter("tags") @Nullable Map<String,Object> tags) {
        this.fingerPrint = fingerPrint;
        this.id = id;
        this.ids = ids;
        this.keyPairs = keyPairs;
        this.nameRegex = nameRegex;
        this.names = names;
        this.outputFile = outputFile;
        this.pairs = pairs;
        this.resourceGroupId = resourceGroupId;
        this.tags = tags;
    }

    /**
     * @return Finger print of the key pair.
     * 
     */
    public Optional<String> fingerPrint() {
        return Optional.ofNullable(this.fingerPrint);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public List<String> ids() {
        return this.ids;
    }
    /**
     * @return A list of key pairs. Each element contains the following attributes:
     * 
     * @deprecated
     * Field &#39;key_pairs&#39; has been deprecated from provider version 1.121.0. New field &#39;pairs&#39; instead.
     * 
     */
    @Deprecated /* Field 'key_pairs' has been deprecated from provider version 1.121.0. New field 'pairs' instead. */
    public List<GetKeyPairsKeyPair> keyPairs() {
        return this.keyPairs;
    }
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }
    /**
     * @return A list of key pair names.
     * 
     */
    public List<String> names() {
        return this.names;
    }
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }
    public List<GetKeyPairsPair> pairs() {
        return this.pairs;
    }
    /**
     * @return The Id of resource group.
     * 
     */
    public Optional<String> resourceGroupId() {
        return Optional.ofNullable(this.resourceGroupId);
    }
    /**
     * @return (Optional, Available in v1.66.0+) A mapping of tags to assign to the resource.
     * 
     */
    public Map<String,Object> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKeyPairsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String fingerPrint;
        private String id;
        private List<String> ids;
        private List<GetKeyPairsKeyPair> keyPairs;
        private @Nullable String nameRegex;
        private List<String> names;
        private @Nullable String outputFile;
        private List<GetKeyPairsPair> pairs;
        private @Nullable String resourceGroupId;
        private @Nullable Map<String,Object> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetKeyPairsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fingerPrint = defaults.fingerPrint;
    	      this.id = defaults.id;
    	      this.ids = defaults.ids;
    	      this.keyPairs = defaults.keyPairs;
    	      this.nameRegex = defaults.nameRegex;
    	      this.names = defaults.names;
    	      this.outputFile = defaults.outputFile;
    	      this.pairs = defaults.pairs;
    	      this.resourceGroupId = defaults.resourceGroupId;
    	      this.tags = defaults.tags;
        }

        public Builder fingerPrint(@Nullable String fingerPrint) {
            this.fingerPrint = fingerPrint;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder ids(List<String> ids) {
            this.ids = Objects.requireNonNull(ids);
            return this;
        }
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }
        public Builder keyPairs(List<GetKeyPairsKeyPair> keyPairs) {
            this.keyPairs = Objects.requireNonNull(keyPairs);
            return this;
        }
        public Builder keyPairs(GetKeyPairsKeyPair... keyPairs) {
            return keyPairs(List.of(keyPairs));
        }
        public Builder nameRegex(@Nullable String nameRegex) {
            this.nameRegex = nameRegex;
            return this;
        }
        public Builder names(List<String> names) {
            this.names = Objects.requireNonNull(names);
            return this;
        }
        public Builder names(String... names) {
            return names(List.of(names));
        }
        public Builder outputFile(@Nullable String outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        public Builder pairs(List<GetKeyPairsPair> pairs) {
            this.pairs = Objects.requireNonNull(pairs);
            return this;
        }
        public Builder pairs(GetKeyPairsPair... pairs) {
            return pairs(List.of(pairs));
        }
        public Builder resourceGroupId(@Nullable String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public Builder tags(@Nullable Map<String,Object> tags) {
            this.tags = tags;
            return this;
        }        public GetKeyPairsResult build() {
            return new GetKeyPairsResult(fingerPrint, id, ids, keyPairs, nameRegex, names, outputFile, pairs, resourceGroupId, tags);
        }
    }
}
