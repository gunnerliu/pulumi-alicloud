// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cloudfirewall.inputs;

import com.pulumi.alicloud.cloudfirewall.inputs.AddressBookEcsTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AddressBookState extends com.pulumi.resources.ResourceArgs {

    public static final AddressBookState Empty = new AddressBookState();

    /**
     * The list of addresses.
     * 
     */
    @Import(name="addressLists")
    private @Nullable Output<List<String>> addressLists;

    /**
     * @return The list of addresses.
     * 
     */
    public Optional<Output<List<String>>> addressLists() {
        return Optional.ofNullable(this.addressLists);
    }

    /**
     * Whether you want to automatically add new matching tags of the ECS IP address to the Address Book. Valid values: `0`, `1`.
     * 
     */
    @Import(name="autoAddTagEcs")
    private @Nullable Output<Integer> autoAddTagEcs;

    /**
     * @return Whether you want to automatically add new matching tags of the ECS IP address to the Address Book. Valid values: `0`, `1`.
     * 
     */
    public Optional<Output<Integer>> autoAddTagEcs() {
        return Optional.ofNullable(this.autoAddTagEcs);
    }

    /**
     * The description of the Address Book.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the Address Book.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * A list of ECS tags. See `ecs_tags` below.
     * 
     */
    @Import(name="ecsTags")
    private @Nullable Output<List<AddressBookEcsTagArgs>> ecsTags;

    /**
     * @return A list of ECS tags. See `ecs_tags` below.
     * 
     */
    public Optional<Output<List<AddressBookEcsTagArgs>>> ecsTags() {
        return Optional.ofNullable(this.ecsTags);
    }

    /**
     * The name of the Address Book.
     * 
     */
    @Import(name="groupName")
    private @Nullable Output<String> groupName;

    /**
     * @return The name of the Address Book.
     * 
     */
    public Optional<Output<String>> groupName() {
        return Optional.ofNullable(this.groupName);
    }

    /**
     * The type of the Address Book. Valid values: `ip`, `ipv6`, `domain`, `port`, `tag`.
     * **NOTE:** From version 1.213.1, `group_type` can be set to `ipv6`, `domain`, `port`.
     * 
     */
    @Import(name="groupType")
    private @Nullable Output<String> groupType;

    /**
     * @return The type of the Address Book. Valid values: `ip`, `ipv6`, `domain`, `port`, `tag`.
     * **NOTE:** From version 1.213.1, `group_type` can be set to `ipv6`, `domain`, `port`.
     * 
     */
    public Optional<Output<String>> groupType() {
        return Optional.ofNullable(this.groupType);
    }

    /**
     * The language of the content within the request and response. Valid values: `zh`, `en`.
     * 
     */
    @Import(name="lang")
    private @Nullable Output<String> lang;

    /**
     * @return The language of the content within the request and response. Valid values: `zh`, `en`.
     * 
     */
    public Optional<Output<String>> lang() {
        return Optional.ofNullable(this.lang);
    }

    /**
     * The logical relation among the ECS tags that to be matched. Default value: `and`. Valid values:
     * 
     */
    @Import(name="tagRelation")
    private @Nullable Output<String> tagRelation;

    /**
     * @return The logical relation among the ECS tags that to be matched. Default value: `and`. Valid values:
     * 
     */
    public Optional<Output<String>> tagRelation() {
        return Optional.ofNullable(this.tagRelation);
    }

    private AddressBookState() {}

    private AddressBookState(AddressBookState $) {
        this.addressLists = $.addressLists;
        this.autoAddTagEcs = $.autoAddTagEcs;
        this.description = $.description;
        this.ecsTags = $.ecsTags;
        this.groupName = $.groupName;
        this.groupType = $.groupType;
        this.lang = $.lang;
        this.tagRelation = $.tagRelation;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AddressBookState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AddressBookState $;

        public Builder() {
            $ = new AddressBookState();
        }

        public Builder(AddressBookState defaults) {
            $ = new AddressBookState(Objects.requireNonNull(defaults));
        }

        /**
         * @param addressLists The list of addresses.
         * 
         * @return builder
         * 
         */
        public Builder addressLists(@Nullable Output<List<String>> addressLists) {
            $.addressLists = addressLists;
            return this;
        }

        /**
         * @param addressLists The list of addresses.
         * 
         * @return builder
         * 
         */
        public Builder addressLists(List<String> addressLists) {
            return addressLists(Output.of(addressLists));
        }

        /**
         * @param addressLists The list of addresses.
         * 
         * @return builder
         * 
         */
        public Builder addressLists(String... addressLists) {
            return addressLists(List.of(addressLists));
        }

        /**
         * @param autoAddTagEcs Whether you want to automatically add new matching tags of the ECS IP address to the Address Book. Valid values: `0`, `1`.
         * 
         * @return builder
         * 
         */
        public Builder autoAddTagEcs(@Nullable Output<Integer> autoAddTagEcs) {
            $.autoAddTagEcs = autoAddTagEcs;
            return this;
        }

        /**
         * @param autoAddTagEcs Whether you want to automatically add new matching tags of the ECS IP address to the Address Book. Valid values: `0`, `1`.
         * 
         * @return builder
         * 
         */
        public Builder autoAddTagEcs(Integer autoAddTagEcs) {
            return autoAddTagEcs(Output.of(autoAddTagEcs));
        }

        /**
         * @param description The description of the Address Book.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the Address Book.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param ecsTags A list of ECS tags. See `ecs_tags` below.
         * 
         * @return builder
         * 
         */
        public Builder ecsTags(@Nullable Output<List<AddressBookEcsTagArgs>> ecsTags) {
            $.ecsTags = ecsTags;
            return this;
        }

        /**
         * @param ecsTags A list of ECS tags. See `ecs_tags` below.
         * 
         * @return builder
         * 
         */
        public Builder ecsTags(List<AddressBookEcsTagArgs> ecsTags) {
            return ecsTags(Output.of(ecsTags));
        }

        /**
         * @param ecsTags A list of ECS tags. See `ecs_tags` below.
         * 
         * @return builder
         * 
         */
        public Builder ecsTags(AddressBookEcsTagArgs... ecsTags) {
            return ecsTags(List.of(ecsTags));
        }

        /**
         * @param groupName The name of the Address Book.
         * 
         * @return builder
         * 
         */
        public Builder groupName(@Nullable Output<String> groupName) {
            $.groupName = groupName;
            return this;
        }

        /**
         * @param groupName The name of the Address Book.
         * 
         * @return builder
         * 
         */
        public Builder groupName(String groupName) {
            return groupName(Output.of(groupName));
        }

        /**
         * @param groupType The type of the Address Book. Valid values: `ip`, `ipv6`, `domain`, `port`, `tag`.
         * **NOTE:** From version 1.213.1, `group_type` can be set to `ipv6`, `domain`, `port`.
         * 
         * @return builder
         * 
         */
        public Builder groupType(@Nullable Output<String> groupType) {
            $.groupType = groupType;
            return this;
        }

        /**
         * @param groupType The type of the Address Book. Valid values: `ip`, `ipv6`, `domain`, `port`, `tag`.
         * **NOTE:** From version 1.213.1, `group_type` can be set to `ipv6`, `domain`, `port`.
         * 
         * @return builder
         * 
         */
        public Builder groupType(String groupType) {
            return groupType(Output.of(groupType));
        }

        /**
         * @param lang The language of the content within the request and response. Valid values: `zh`, `en`.
         * 
         * @return builder
         * 
         */
        public Builder lang(@Nullable Output<String> lang) {
            $.lang = lang;
            return this;
        }

        /**
         * @param lang The language of the content within the request and response. Valid values: `zh`, `en`.
         * 
         * @return builder
         * 
         */
        public Builder lang(String lang) {
            return lang(Output.of(lang));
        }

        /**
         * @param tagRelation The logical relation among the ECS tags that to be matched. Default value: `and`. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder tagRelation(@Nullable Output<String> tagRelation) {
            $.tagRelation = tagRelation;
            return this;
        }

        /**
         * @param tagRelation The logical relation among the ECS tags that to be matched. Default value: `and`. Valid values:
         * 
         * @return builder
         * 
         */
        public Builder tagRelation(String tagRelation) {
            return tagRelation(Output.of(tagRelation));
        }

        public AddressBookState build() {
            return $;
        }
    }

}
