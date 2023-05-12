// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cms.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetMonitorGroupsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetMonitorGroupsPlainArgs Empty = new GetMonitorGroupsPlainArgs();

    /**
     * The ID of the tag rule.
     * 
     */
    @Import(name="dynamicTagRuleId")
    private @Nullable String dynamicTagRuleId;

    /**
     * @return The ID of the tag rule.
     * 
     */
    public Optional<String> dynamicTagRuleId() {
        return Optional.ofNullable(this.dynamicTagRuleId);
    }

    /**
     * A list of Monitor Group IDs.
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return A list of Monitor Group IDs.
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * The include template history.
     * 
     */
    @Import(name="includeTemplateHistory")
    private @Nullable Boolean includeTemplateHistory;

    /**
     * @return The include template history.
     * 
     */
    public Optional<Boolean> includeTemplateHistory() {
        return Optional.ofNullable(this.includeTemplateHistory);
    }

    /**
     * The keyword to be matched.
     * 
     */
    @Import(name="keyword")
    private @Nullable String keyword;

    /**
     * @return The keyword to be matched.
     * 
     */
    public Optional<String> keyword() {
        return Optional.ofNullable(this.keyword);
    }

    /**
     * The name of the application group.
     * 
     */
    @Import(name="monitorGroupName")
    private @Nullable String monitorGroupName;

    /**
     * @return The name of the application group.
     * 
     */
    public Optional<String> monitorGroupName() {
        return Optional.ofNullable(this.monitorGroupName);
    }

    /**
     * A regex string to filter results by Monitor Group name.
     * 
     */
    @Import(name="nameRegex")
    private @Nullable String nameRegex;

    /**
     * @return A regex string to filter results by Monitor Group name.
     * 
     */
    public Optional<String> nameRegex() {
        return Optional.ofNullable(this.nameRegex);
    }

    /**
     * File name where to save data source results (after running `pulumi preview`).
     * 
     */
    @Import(name="outputFile")
    private @Nullable String outputFile;

    /**
     * @return File name where to save data source results (after running `pulumi preview`).
     * 
     */
    public Optional<String> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    /**
     * The select contact groups.
     * 
     */
    @Import(name="selectContactGroups")
    private @Nullable Boolean selectContactGroups;

    /**
     * @return The select contact groups.
     * 
     */
    public Optional<Boolean> selectContactGroups() {
        return Optional.ofNullable(this.selectContactGroups);
    }

    /**
     * A map of tags assigned to the Cms Monitor Group.
     * 
     */
    @Import(name="tags")
    private @Nullable Map<String,Object> tags;

    /**
     * @return A map of tags assigned to the Cms Monitor Group.
     * 
     */
    public Optional<Map<String,Object>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The type of the application group.
     * 
     */
    @Import(name="type")
    private @Nullable String type;

    /**
     * @return The type of the application group.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    private GetMonitorGroupsPlainArgs() {}

    private GetMonitorGroupsPlainArgs(GetMonitorGroupsPlainArgs $) {
        this.dynamicTagRuleId = $.dynamicTagRuleId;
        this.ids = $.ids;
        this.includeTemplateHistory = $.includeTemplateHistory;
        this.keyword = $.keyword;
        this.monitorGroupName = $.monitorGroupName;
        this.nameRegex = $.nameRegex;
        this.outputFile = $.outputFile;
        this.selectContactGroups = $.selectContactGroups;
        this.tags = $.tags;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMonitorGroupsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMonitorGroupsPlainArgs $;

        public Builder() {
            $ = new GetMonitorGroupsPlainArgs();
        }

        public Builder(GetMonitorGroupsPlainArgs defaults) {
            $ = new GetMonitorGroupsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dynamicTagRuleId The ID of the tag rule.
         * 
         * @return builder
         * 
         */
        public Builder dynamicTagRuleId(@Nullable String dynamicTagRuleId) {
            $.dynamicTagRuleId = dynamicTagRuleId;
            return this;
        }

        /**
         * @param ids A list of Monitor Group IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids A list of Monitor Group IDs.
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param includeTemplateHistory The include template history.
         * 
         * @return builder
         * 
         */
        public Builder includeTemplateHistory(@Nullable Boolean includeTemplateHistory) {
            $.includeTemplateHistory = includeTemplateHistory;
            return this;
        }

        /**
         * @param keyword The keyword to be matched.
         * 
         * @return builder
         * 
         */
        public Builder keyword(@Nullable String keyword) {
            $.keyword = keyword;
            return this;
        }

        /**
         * @param monitorGroupName The name of the application group.
         * 
         * @return builder
         * 
         */
        public Builder monitorGroupName(@Nullable String monitorGroupName) {
            $.monitorGroupName = monitorGroupName;
            return this;
        }

        /**
         * @param nameRegex A regex string to filter results by Monitor Group name.
         * 
         * @return builder
         * 
         */
        public Builder nameRegex(@Nullable String nameRegex) {
            $.nameRegex = nameRegex;
            return this;
        }

        /**
         * @param outputFile File name where to save data source results (after running `pulumi preview`).
         * 
         * @return builder
         * 
         */
        public Builder outputFile(@Nullable String outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        /**
         * @param selectContactGroups The select contact groups.
         * 
         * @return builder
         * 
         */
        public Builder selectContactGroups(@Nullable Boolean selectContactGroups) {
            $.selectContactGroups = selectContactGroups;
            return this;
        }

        /**
         * @param tags A map of tags assigned to the Cms Monitor Group.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Map<String,Object> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param type The type of the application group.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable String type) {
            $.type = type;
            return this;
        }

        public GetMonitorGroupsPlainArgs build() {
            return $;
        }
    }

}
