// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cms;

import com.pulumi.alicloud.cms.inputs.DynamicTagGroupMatchExpressArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DynamicTagGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final DynamicTagGroupArgs Empty = new DynamicTagGroupArgs();

    /**
     * Alarm contact group. The value range of N is 1~100. The alarm notification of the application group is sent to the alarm contact in the alarm contact group.
     * 
     */
    @Import(name="contactGroupLists", required=true)
    private Output<List<String>> contactGroupLists;

    /**
     * @return Alarm contact group. The value range of N is 1~100. The alarm notification of the application group is sent to the alarm contact in the alarm contact group.
     * 
     */
    public Output<List<String>> contactGroupLists() {
        return this.contactGroupLists;
    }

    /**
     * The relationship between conditional expressions. Valid values: `and`, `or`.
     * 
     */
    @Import(name="matchExpressFilterRelation")
    private @Nullable Output<String> matchExpressFilterRelation;

    /**
     * @return The relationship between conditional expressions. Valid values: `and`, `or`.
     * 
     */
    public Optional<Output<String>> matchExpressFilterRelation() {
        return Optional.ofNullable(this.matchExpressFilterRelation);
    }

    /**
     * The label generates a matching expression that applies the grouping. See the following `Block match_express`.
     * 
     */
    @Import(name="matchExpresses", required=true)
    private Output<List<DynamicTagGroupMatchExpressArgs>> matchExpresses;

    /**
     * @return The label generates a matching expression that applies the grouping. See the following `Block match_express`.
     * 
     */
    public Output<List<DynamicTagGroupMatchExpressArgs>> matchExpresses() {
        return this.matchExpresses;
    }

    /**
     * The tag key of the tag.
     * 
     */
    @Import(name="tagKey", required=true)
    private Output<String> tagKey;

    /**
     * @return The tag key of the tag.
     * 
     */
    public Output<String> tagKey() {
        return this.tagKey;
    }

    /**
     * Alarm template ID list.
     * 
     */
    @Import(name="templateIdLists")
    private @Nullable Output<List<String>> templateIdLists;

    /**
     * @return Alarm template ID list.
     * 
     */
    public Optional<Output<List<String>>> templateIdLists() {
        return Optional.ofNullable(this.templateIdLists);
    }

    private DynamicTagGroupArgs() {}

    private DynamicTagGroupArgs(DynamicTagGroupArgs $) {
        this.contactGroupLists = $.contactGroupLists;
        this.matchExpressFilterRelation = $.matchExpressFilterRelation;
        this.matchExpresses = $.matchExpresses;
        this.tagKey = $.tagKey;
        this.templateIdLists = $.templateIdLists;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DynamicTagGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DynamicTagGroupArgs $;

        public Builder() {
            $ = new DynamicTagGroupArgs();
        }

        public Builder(DynamicTagGroupArgs defaults) {
            $ = new DynamicTagGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param contactGroupLists Alarm contact group. The value range of N is 1~100. The alarm notification of the application group is sent to the alarm contact in the alarm contact group.
         * 
         * @return builder
         * 
         */
        public Builder contactGroupLists(Output<List<String>> contactGroupLists) {
            $.contactGroupLists = contactGroupLists;
            return this;
        }

        /**
         * @param contactGroupLists Alarm contact group. The value range of N is 1~100. The alarm notification of the application group is sent to the alarm contact in the alarm contact group.
         * 
         * @return builder
         * 
         */
        public Builder contactGroupLists(List<String> contactGroupLists) {
            return contactGroupLists(Output.of(contactGroupLists));
        }

        /**
         * @param contactGroupLists Alarm contact group. The value range of N is 1~100. The alarm notification of the application group is sent to the alarm contact in the alarm contact group.
         * 
         * @return builder
         * 
         */
        public Builder contactGroupLists(String... contactGroupLists) {
            return contactGroupLists(List.of(contactGroupLists));
        }

        /**
         * @param matchExpressFilterRelation The relationship between conditional expressions. Valid values: `and`, `or`.
         * 
         * @return builder
         * 
         */
        public Builder matchExpressFilterRelation(@Nullable Output<String> matchExpressFilterRelation) {
            $.matchExpressFilterRelation = matchExpressFilterRelation;
            return this;
        }

        /**
         * @param matchExpressFilterRelation The relationship between conditional expressions. Valid values: `and`, `or`.
         * 
         * @return builder
         * 
         */
        public Builder matchExpressFilterRelation(String matchExpressFilterRelation) {
            return matchExpressFilterRelation(Output.of(matchExpressFilterRelation));
        }

        /**
         * @param matchExpresses The label generates a matching expression that applies the grouping. See the following `Block match_express`.
         * 
         * @return builder
         * 
         */
        public Builder matchExpresses(Output<List<DynamicTagGroupMatchExpressArgs>> matchExpresses) {
            $.matchExpresses = matchExpresses;
            return this;
        }

        /**
         * @param matchExpresses The label generates a matching expression that applies the grouping. See the following `Block match_express`.
         * 
         * @return builder
         * 
         */
        public Builder matchExpresses(List<DynamicTagGroupMatchExpressArgs> matchExpresses) {
            return matchExpresses(Output.of(matchExpresses));
        }

        /**
         * @param matchExpresses The label generates a matching expression that applies the grouping. See the following `Block match_express`.
         * 
         * @return builder
         * 
         */
        public Builder matchExpresses(DynamicTagGroupMatchExpressArgs... matchExpresses) {
            return matchExpresses(List.of(matchExpresses));
        }

        /**
         * @param tagKey The tag key of the tag.
         * 
         * @return builder
         * 
         */
        public Builder tagKey(Output<String> tagKey) {
            $.tagKey = tagKey;
            return this;
        }

        /**
         * @param tagKey The tag key of the tag.
         * 
         * @return builder
         * 
         */
        public Builder tagKey(String tagKey) {
            return tagKey(Output.of(tagKey));
        }

        /**
         * @param templateIdLists Alarm template ID list.
         * 
         * @return builder
         * 
         */
        public Builder templateIdLists(@Nullable Output<List<String>> templateIdLists) {
            $.templateIdLists = templateIdLists;
            return this;
        }

        /**
         * @param templateIdLists Alarm template ID list.
         * 
         * @return builder
         * 
         */
        public Builder templateIdLists(List<String> templateIdLists) {
            return templateIdLists(Output.of(templateIdLists));
        }

        /**
         * @param templateIdLists Alarm template ID list.
         * 
         * @return builder
         * 
         */
        public Builder templateIdLists(String... templateIdLists) {
            return templateIdLists(List.of(templateIdLists));
        }

        public DynamicTagGroupArgs build() {
            $.contactGroupLists = Objects.requireNonNull($.contactGroupLists, "expected parameter 'contactGroupLists' to be non-null");
            $.matchExpresses = Objects.requireNonNull($.matchExpresses, "expected parameter 'matchExpresses' to be non-null");
            $.tagKey = Objects.requireNonNull($.tagKey, "expected parameter 'tagKey' to be non-null");
            return $;
        }
    }

}
