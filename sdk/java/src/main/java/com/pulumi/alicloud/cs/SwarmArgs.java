// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SwarmArgs extends com.pulumi.resources.ResourceArgs {

    public static final SwarmArgs Empty = new SwarmArgs();

    @Import(name="cidrBlock", required=true)
    private Output<String> cidrBlock;

    public Output<String> cidrBlock() {
        return this.cidrBlock;
    }

    @Import(name="diskCategory")
    private @Nullable Output<String> diskCategory;

    public Optional<Output<String>> diskCategory() {
        return Optional.ofNullable(this.diskCategory);
    }

    @Import(name="diskSize")
    private @Nullable Output<Integer> diskSize;

    public Optional<Output<Integer>> diskSize() {
        return Optional.ofNullable(this.diskSize);
    }

    @Import(name="imageId")
    private @Nullable Output<String> imageId;

    public Optional<Output<String>> imageId() {
        return Optional.ofNullable(this.imageId);
    }

    @Import(name="instanceType", required=true)
    private Output<String> instanceType;

    public Output<String> instanceType() {
        return this.instanceType;
    }

    @Import(name="isOutdated")
    private @Nullable Output<Boolean> isOutdated;

    public Optional<Output<Boolean>> isOutdated() {
        return Optional.ofNullable(this.isOutdated);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="namePrefix")
    private @Nullable Output<String> namePrefix;

    public Optional<Output<String>> namePrefix() {
        return Optional.ofNullable(this.namePrefix);
    }

    @Import(name="needSlb")
    private @Nullable Output<Boolean> needSlb;

    public Optional<Output<Boolean>> needSlb() {
        return Optional.ofNullable(this.needSlb);
    }

    @Import(name="nodeNumber")
    private @Nullable Output<Integer> nodeNumber;

    public Optional<Output<Integer>> nodeNumber() {
        return Optional.ofNullable(this.nodeNumber);
    }

    @Import(name="password", required=true)
    private Output<String> password;

    public Output<String> password() {
        return this.password;
    }

    @Import(name="releaseEip")
    private @Nullable Output<Boolean> releaseEip;

    public Optional<Output<Boolean>> releaseEip() {
        return Optional.ofNullable(this.releaseEip);
    }

    /**
     * @deprecated
     * Field &#39;size&#39; has been deprecated from provider version 1.9.1. New field &#39;node_number&#39; replaces it.
     * 
     */
    @Deprecated /* Field 'size' has been deprecated from provider version 1.9.1. New field 'node_number' replaces it. */
    @Import(name="size")
    private @Nullable Output<Integer> size;

    /**
     * @deprecated
     * Field &#39;size&#39; has been deprecated from provider version 1.9.1. New field &#39;node_number&#39; replaces it.
     * 
     */
    @Deprecated /* Field 'size' has been deprecated from provider version 1.9.1. New field 'node_number' replaces it. */
    public Optional<Output<Integer>> size() {
        return Optional.ofNullable(this.size);
    }

    @Import(name="vswitchId", required=true)
    private Output<String> vswitchId;

    public Output<String> vswitchId() {
        return this.vswitchId;
    }

    private SwarmArgs() {}

    private SwarmArgs(SwarmArgs $) {
        this.cidrBlock = $.cidrBlock;
        this.diskCategory = $.diskCategory;
        this.diskSize = $.diskSize;
        this.imageId = $.imageId;
        this.instanceType = $.instanceType;
        this.isOutdated = $.isOutdated;
        this.name = $.name;
        this.namePrefix = $.namePrefix;
        this.needSlb = $.needSlb;
        this.nodeNumber = $.nodeNumber;
        this.password = $.password;
        this.releaseEip = $.releaseEip;
        this.size = $.size;
        this.vswitchId = $.vswitchId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SwarmArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SwarmArgs $;

        public Builder() {
            $ = new SwarmArgs();
        }

        public Builder(SwarmArgs defaults) {
            $ = new SwarmArgs(Objects.requireNonNull(defaults));
        }

        public Builder cidrBlock(Output<String> cidrBlock) {
            $.cidrBlock = cidrBlock;
            return this;
        }

        public Builder cidrBlock(String cidrBlock) {
            return cidrBlock(Output.of(cidrBlock));
        }

        public Builder diskCategory(@Nullable Output<String> diskCategory) {
            $.diskCategory = diskCategory;
            return this;
        }

        public Builder diskCategory(String diskCategory) {
            return diskCategory(Output.of(diskCategory));
        }

        public Builder diskSize(@Nullable Output<Integer> diskSize) {
            $.diskSize = diskSize;
            return this;
        }

        public Builder diskSize(Integer diskSize) {
            return diskSize(Output.of(diskSize));
        }

        public Builder imageId(@Nullable Output<String> imageId) {
            $.imageId = imageId;
            return this;
        }

        public Builder imageId(String imageId) {
            return imageId(Output.of(imageId));
        }

        public Builder instanceType(Output<String> instanceType) {
            $.instanceType = instanceType;
            return this;
        }

        public Builder instanceType(String instanceType) {
            return instanceType(Output.of(instanceType));
        }

        public Builder isOutdated(@Nullable Output<Boolean> isOutdated) {
            $.isOutdated = isOutdated;
            return this;
        }

        public Builder isOutdated(Boolean isOutdated) {
            return isOutdated(Output.of(isOutdated));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder namePrefix(@Nullable Output<String> namePrefix) {
            $.namePrefix = namePrefix;
            return this;
        }

        public Builder namePrefix(String namePrefix) {
            return namePrefix(Output.of(namePrefix));
        }

        public Builder needSlb(@Nullable Output<Boolean> needSlb) {
            $.needSlb = needSlb;
            return this;
        }

        public Builder needSlb(Boolean needSlb) {
            return needSlb(Output.of(needSlb));
        }

        public Builder nodeNumber(@Nullable Output<Integer> nodeNumber) {
            $.nodeNumber = nodeNumber;
            return this;
        }

        public Builder nodeNumber(Integer nodeNumber) {
            return nodeNumber(Output.of(nodeNumber));
        }

        public Builder password(Output<String> password) {
            $.password = password;
            return this;
        }

        public Builder password(String password) {
            return password(Output.of(password));
        }

        public Builder releaseEip(@Nullable Output<Boolean> releaseEip) {
            $.releaseEip = releaseEip;
            return this;
        }

        public Builder releaseEip(Boolean releaseEip) {
            return releaseEip(Output.of(releaseEip));
        }

        /**
         * @return builder
         * 
         * @deprecated
         * Field &#39;size&#39; has been deprecated from provider version 1.9.1. New field &#39;node_number&#39; replaces it.
         * 
         */
        @Deprecated /* Field 'size' has been deprecated from provider version 1.9.1. New field 'node_number' replaces it. */
        public Builder size(@Nullable Output<Integer> size) {
            $.size = size;
            return this;
        }

        /**
         * @return builder
         * 
         * @deprecated
         * Field &#39;size&#39; has been deprecated from provider version 1.9.1. New field &#39;node_number&#39; replaces it.
         * 
         */
        @Deprecated /* Field 'size' has been deprecated from provider version 1.9.1. New field 'node_number' replaces it. */
        public Builder size(Integer size) {
            return size(Output.of(size));
        }

        public Builder vswitchId(Output<String> vswitchId) {
            $.vswitchId = vswitchId;
            return this;
        }

        public Builder vswitchId(String vswitchId) {
            return vswitchId(Output.of(vswitchId));
        }

        public SwarmArgs build() {
            $.cidrBlock = Objects.requireNonNull($.cidrBlock, "expected parameter 'cidrBlock' to be non-null");
            $.instanceType = Objects.requireNonNull($.instanceType, "expected parameter 'instanceType' to be non-null");
            $.password = Objects.requireNonNull($.password, "expected parameter 'password' to be non-null");
            $.vswitchId = Objects.requireNonNull($.vswitchId, "expected parameter 'vswitchId' to be non-null");
            return $;
        }
    }

}
