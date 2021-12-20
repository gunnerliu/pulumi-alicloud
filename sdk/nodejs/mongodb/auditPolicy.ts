// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a MongoDB Audit Policy resource.
 *
 * For information about MongoDB Audit Policy and how to use it, see [What is Audit Policy](https://www.alibabacloud.com/help/doc-detail/131941.html).
 *
 * > **NOTE:** Available in v1.148.0+.
 *
 * ## Import
 *
 * MongoDB Audit Policy can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:mongodb/auditPolicy:AuditPolicy example <db_instance_id>
 * ```
 */
export class AuditPolicy extends pulumi.CustomResource {
    /**
     * Get an existing AuditPolicy resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AuditPolicyState, opts?: pulumi.CustomResourceOptions): AuditPolicy {
        return new AuditPolicy(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:mongodb/auditPolicy:AuditPolicy';

    /**
     * Returns true if the given object is an instance of AuditPolicy.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AuditPolicy {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AuditPolicy.__pulumiType;
    }

    /**
     * The status of the audit log. Valid values: `disabled`, `enable`.
     */
    public readonly auditStatus!: pulumi.Output<string>;
    /**
     * The ID of the instance.
     */
    public readonly dbInstanceId!: pulumi.Output<string>;
    /**
     * The retention period of audit logs. Valid values: `1` to `30`. Default value: `30`.
     */
    public readonly storagePeriod!: pulumi.Output<number | undefined>;

    /**
     * Create a AuditPolicy resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AuditPolicyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AuditPolicyArgs | AuditPolicyState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AuditPolicyState | undefined;
            inputs["auditStatus"] = state ? state.auditStatus : undefined;
            inputs["dbInstanceId"] = state ? state.dbInstanceId : undefined;
            inputs["storagePeriod"] = state ? state.storagePeriod : undefined;
        } else {
            const args = argsOrState as AuditPolicyArgs | undefined;
            if ((!args || args.auditStatus === undefined) && !opts.urn) {
                throw new Error("Missing required property 'auditStatus'");
            }
            if ((!args || args.dbInstanceId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'dbInstanceId'");
            }
            inputs["auditStatus"] = args ? args.auditStatus : undefined;
            inputs["dbInstanceId"] = args ? args.dbInstanceId : undefined;
            inputs["storagePeriod"] = args ? args.storagePeriod : undefined;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(AuditPolicy.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AuditPolicy resources.
 */
export interface AuditPolicyState {
    /**
     * The status of the audit log. Valid values: `disabled`, `enable`.
     */
    auditStatus?: pulumi.Input<string>;
    /**
     * The ID of the instance.
     */
    dbInstanceId?: pulumi.Input<string>;
    /**
     * The retention period of audit logs. Valid values: `1` to `30`. Default value: `30`.
     */
    storagePeriod?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a AuditPolicy resource.
 */
export interface AuditPolicyArgs {
    /**
     * The status of the audit log. Valid values: `disabled`, `enable`.
     */
    auditStatus: pulumi.Input<string>;
    /**
     * The ID of the instance.
     */
    dbInstanceId: pulumi.Input<string>;
    /**
     * The retention period of audit logs. Valid values: `1` to `30`. Default value: `30`.
     */
    storagePeriod?: pulumi.Input<number>;
}
