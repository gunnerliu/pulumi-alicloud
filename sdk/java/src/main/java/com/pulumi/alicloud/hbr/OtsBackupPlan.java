// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.hbr;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.hbr.OtsBackupPlanArgs;
import com.pulumi.alicloud.hbr.inputs.OtsBackupPlanState;
import com.pulumi.alicloud.hbr.outputs.OtsBackupPlanOtsDetail;
import com.pulumi.alicloud.hbr.outputs.OtsBackupPlanRule;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a HBR Ots Backup Plan resource.
 * 
 * For information about HBR Ots Backup Plan and how to use it, see [What is Ots Backup Plan](https://www.alibabacloud.com/help/en/hybrid-backup-recovery/latest/overview).
 * 
 * &gt; **NOTE:** Available in v1.163.0+.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * HBR Ots Backup Plan can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:hbr/otsBackupPlan:OtsBackupPlan example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:hbr/otsBackupPlan:OtsBackupPlan")
public class OtsBackupPlan extends com.pulumi.resources.CustomResource {
    /**
     * Backup type. Valid values: `COMPLETE`.
     * 
     */
    @Export(name="backupType", type=String.class, parameters={})
    private Output<String> backupType;

    /**
     * @return Backup type. Valid values: `COMPLETE`.
     * 
     */
    public Output<String> backupType() {
        return this.backupType;
    }
    /**
     * The role name created in the original account RAM backup by the cross account managed by the current account.
     * 
     */
    @Export(name="crossAccountRoleName", type=String.class, parameters={})
    private Output</* @Nullable */ String> crossAccountRoleName;

    /**
     * @return The role name created in the original account RAM backup by the cross account managed by the current account.
     * 
     */
    public Output<Optional<String>> crossAccountRoleName() {
        return Codegen.optional(this.crossAccountRoleName);
    }
    /**
     * The type of the cross account backup. Valid values: `SELF_ACCOUNT`, `CROSS_ACCOUNT`.
     * 
     */
    @Export(name="crossAccountType", type=String.class, parameters={})
    private Output<String> crossAccountType;

    /**
     * @return The type of the cross account backup. Valid values: `SELF_ACCOUNT`, `CROSS_ACCOUNT`.
     * 
     */
    public Output<String> crossAccountType() {
        return this.crossAccountType;
    }
    /**
     * The original account ID of the cross account backup managed by the current account.
     * 
     */
    @Export(name="crossAccountUserId", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> crossAccountUserId;

    /**
     * @return The original account ID of the cross account backup managed by the current account.
     * 
     */
    public Output<Optional<Integer>> crossAccountUserId() {
        return Codegen.optional(this.crossAccountUserId);
    }
    /**
     * Whether to disable the backup task. Valid values: `true`, `false`. Default values: `false`.
     * 
     */
    @Export(name="disabled", type=Boolean.class, parameters={})
    private Output<Boolean> disabled;

    /**
     * @return Whether to disable the backup task. Valid values: `true`, `false`. Default values: `false`.
     * 
     */
    public Output<Boolean> disabled() {
        return this.disabled;
    }
    /**
     * The name of the Table store instance. **Note:** Required while source_type equals `OTS_TABLE`.
     * 
     */
    @Export(name="instanceName", type=String.class, parameters={})
    private Output</* @Nullable */ String> instanceName;

    /**
     * @return The name of the Table store instance. **Note:** Required while source_type equals `OTS_TABLE`.
     * 
     */
    public Output<Optional<String>> instanceName() {
        return Codegen.optional(this.instanceName);
    }
    /**
     * The name of the backup plan. 1~64 characters, the backup plan name of each data source type in a single warehouse required to be unique.
     * 
     */
    @Export(name="otsBackupPlanName", type=String.class, parameters={})
    private Output<String> otsBackupPlanName;

    /**
     * @return The name of the backup plan. 1~64 characters, the backup plan name of each data source type in a single warehouse required to be unique.
     * 
     */
    public Output<String> otsBackupPlanName() {
        return this.otsBackupPlanName;
    }
    /**
     * The details about the Table store instance. See the following `Block ots_detail`. **Note:** Required while source_type equals `OTS_TABLE`.
     * 
     */
    @Export(name="otsDetails", type=List.class, parameters={OtsBackupPlanOtsDetail.class})
    private Output</* @Nullable */ List<OtsBackupPlanOtsDetail>> otsDetails;

    /**
     * @return The details about the Table store instance. See the following `Block ots_detail`. **Note:** Required while source_type equals `OTS_TABLE`.
     * 
     */
    public Output<Optional<List<OtsBackupPlanOtsDetail>>> otsDetails() {
        return Codegen.optional(this.otsDetails);
    }
    /**
     * Backup retention days, the minimum is 1.
     * 
     */
    @Export(name="retention", type=String.class, parameters={})
    private Output<String> retention;

    /**
     * @return Backup retention days, the minimum is 1.
     * 
     */
    public Output<String> retention() {
        return this.retention;
    }
    /**
     * The backup plan rule. See the following `Block rules`. **Note:** Required while source_type equals `OTS_TABLE`.
     * 
     */
    @Export(name="rules", type=List.class, parameters={OtsBackupPlanRule.class})
    private Output</* @Nullable */ List<OtsBackupPlanRule>> rules;

    /**
     * @return The backup plan rule. See the following `Block rules`. **Note:** Required while source_type equals `OTS_TABLE`.
     * 
     */
    public Output<Optional<List<OtsBackupPlanRule>>> rules() {
        return Codegen.optional(this.rules);
    }
    /**
     * Backup strategy. Optional format: `I|{startTime}|{interval}`. It means to execute a backup task every `{interval}` starting from `{startTime}`. The backup task for the elapsed time will not be compensated. If the last backup task has not completed yet, the next backup task will not be triggered.
     * 
     * @deprecated
     * Field &#39;schedule&#39; has been deprecated from version 1.163.0. Use &#39;rules&#39; instead.
     * 
     */
    @Deprecated /* Field 'schedule' has been deprecated from version 1.163.0. Use 'rules' instead. */
    @Export(name="schedule", type=String.class, parameters={})
    private Output</* @Nullable */ String> schedule;

    /**
     * @return Backup strategy. Optional format: `I|{startTime}|{interval}`. It means to execute a backup task every `{interval}` starting from `{startTime}`. The backup task for the elapsed time will not be compensated. If the last backup task has not completed yet, the next backup task will not be triggered.
     * 
     */
    public Output<Optional<String>> schedule() {
        return Codegen.optional(this.schedule);
    }
    /**
     * The ID of backup vault.
     * 
     */
    @Export(name="vaultId", type=String.class, parameters={})
    private Output</* @Nullable */ String> vaultId;

    /**
     * @return The ID of backup vault.
     * 
     */
    public Output<Optional<String>> vaultId() {
        return Codegen.optional(this.vaultId);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public OtsBackupPlan(String name) {
        this(name, OtsBackupPlanArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public OtsBackupPlan(String name, OtsBackupPlanArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public OtsBackupPlan(String name, OtsBackupPlanArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:hbr/otsBackupPlan:OtsBackupPlan", name, args == null ? OtsBackupPlanArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private OtsBackupPlan(String name, Output<String> id, @Nullable OtsBackupPlanState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:hbr/otsBackupPlan:OtsBackupPlan", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static OtsBackupPlan get(String name, Output<String> id, @Nullable OtsBackupPlanState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new OtsBackupPlan(name, id, state, options);
    }
}
