// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a DNS Record resource.
 */
export class Record extends pulumi.CustomResource {
    /**
     * Get an existing Record resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RecordState): Record {
        return new Record(name, <any>state, { id });
    }

    /**
     * Host record for the domain record. This host_record can have at most 253 characters, and each part split with "." can have at most 63 characters, and must contain only alphanumeric characters or hyphens, such as "-",".","*","@",  and must not begin or end with "-".
     */
    public readonly hostRecord: pulumi.Output<string>;
    public /*out*/ readonly locked: pulumi.Output<boolean>;
    /**
     * Name of the domain. This name without suffix can have a string of 1 to 63 characters, must contain only alphanumeric characters or "-", and must not begin or end with "-", and "-" must not in the 3th and 4th character positions at the same time. Suffix `.sh` and `.tel` are not supported.
     */
    public readonly name: pulumi.Output<string>;
    /**
     * The priority of domain record. Valid values are `[1-10]`. When the `type` is `MX`, this parameter is required.
     */
    public readonly priority: pulumi.Output<number | undefined>;
    /**
     * The parsing line of domain record. Valid values are `default`, `telecom`, `unicom`, `mobile`, `oversea` and `edu`. When the `type` is `FORWORD_URL`, this parameter must be `default`. Default value is `default`.
     */
    public readonly routing: pulumi.Output<string | undefined>;
    /**
     * The record status. `Enable` or `Disable`.
     */
    public /*out*/ readonly status: pulumi.Output<string>;
    /**
     * The effective time of domain record. Its scope depends on the edition of the cloud resolution. Free is `[600, 86400]`, Basic is `[120, 86400]`, Standard is `[60, 86400]`, Ultimate is `[10, 86400]`, Exclusive is `[1, 86400]`. Default value is `600`.
     */
    public readonly ttl: pulumi.Output<number | undefined>;
    /**
     * The type of domain record. Valid values are `A`,`NS`,`MX`,`TXT`,`CNAME`,`SRV`,`AAAA`,`REDIRECT_URL` and `FORWORD_URL`.
     */
    public readonly type: pulumi.Output<string>;
    /**
     * The value of domain record.
     */
    public readonly value: pulumi.Output<string>;

    /**
     * Create a Record resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: RecordArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: RecordArgs | RecordState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state: RecordState = argsOrState as RecordState | undefined;
            inputs["hostRecord"] = state ? state.hostRecord : undefined;
            inputs["locked"] = state ? state.locked : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["priority"] = state ? state.priority : undefined;
            inputs["routing"] = state ? state.routing : undefined;
            inputs["status"] = state ? state.status : undefined;
            inputs["ttl"] = state ? state.ttl : undefined;
            inputs["type"] = state ? state.type : undefined;
            inputs["value"] = state ? state.value : undefined;
        } else {
            const args = argsOrState as RecordArgs | undefined;
            if (!args || args.hostRecord === undefined) {
                throw new Error("Missing required property 'hostRecord'");
            }
            if (!args || args.type === undefined) {
                throw new Error("Missing required property 'type'");
            }
            if (!args || args.value === undefined) {
                throw new Error("Missing required property 'value'");
            }
            inputs["hostRecord"] = args ? args.hostRecord : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["priority"] = args ? args.priority : undefined;
            inputs["routing"] = args ? args.routing : undefined;
            inputs["ttl"] = args ? args.ttl : undefined;
            inputs["type"] = args ? args.type : undefined;
            inputs["value"] = args ? args.value : undefined;
            inputs["locked"] = undefined /*out*/;
            inputs["status"] = undefined /*out*/;
        }
        super("alicloud:dns/record:Record", name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Record resources.
 */
export interface RecordState {
    /**
     * Host record for the domain record. This host_record can have at most 253 characters, and each part split with "." can have at most 63 characters, and must contain only alphanumeric characters or hyphens, such as "-",".","*","@",  and must not begin or end with "-".
     */
    readonly hostRecord?: pulumi.Input<string>;
    readonly locked?: pulumi.Input<boolean>;
    /**
     * Name of the domain. This name without suffix can have a string of 1 to 63 characters, must contain only alphanumeric characters or "-", and must not begin or end with "-", and "-" must not in the 3th and 4th character positions at the same time. Suffix `.sh` and `.tel` are not supported.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The priority of domain record. Valid values are `[1-10]`. When the `type` is `MX`, this parameter is required.
     */
    readonly priority?: pulumi.Input<number>;
    /**
     * The parsing line of domain record. Valid values are `default`, `telecom`, `unicom`, `mobile`, `oversea` and `edu`. When the `type` is `FORWORD_URL`, this parameter must be `default`. Default value is `default`.
     */
    readonly routing?: pulumi.Input<string>;
    /**
     * The record status. `Enable` or `Disable`.
     */
    readonly status?: pulumi.Input<string>;
    /**
     * The effective time of domain record. Its scope depends on the edition of the cloud resolution. Free is `[600, 86400]`, Basic is `[120, 86400]`, Standard is `[60, 86400]`, Ultimate is `[10, 86400]`, Exclusive is `[1, 86400]`. Default value is `600`.
     */
    readonly ttl?: pulumi.Input<number>;
    /**
     * The type of domain record. Valid values are `A`,`NS`,`MX`,`TXT`,`CNAME`,`SRV`,`AAAA`,`REDIRECT_URL` and `FORWORD_URL`.
     */
    readonly type?: pulumi.Input<string>;
    /**
     * The value of domain record.
     */
    readonly value?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Record resource.
 */
export interface RecordArgs {
    /**
     * Host record for the domain record. This host_record can have at most 253 characters, and each part split with "." can have at most 63 characters, and must contain only alphanumeric characters or hyphens, such as "-",".","*","@",  and must not begin or end with "-".
     */
    readonly hostRecord: pulumi.Input<string>;
    /**
     * Name of the domain. This name without suffix can have a string of 1 to 63 characters, must contain only alphanumeric characters or "-", and must not begin or end with "-", and "-" must not in the 3th and 4th character positions at the same time. Suffix `.sh` and `.tel` are not supported.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * The priority of domain record. Valid values are `[1-10]`. When the `type` is `MX`, this parameter is required.
     */
    readonly priority?: pulumi.Input<number>;
    /**
     * The parsing line of domain record. Valid values are `default`, `telecom`, `unicom`, `mobile`, `oversea` and `edu`. When the `type` is `FORWORD_URL`, this parameter must be `default`. Default value is `default`.
     */
    readonly routing?: pulumi.Input<string>;
    /**
     * The effective time of domain record. Its scope depends on the edition of the cloud resolution. Free is `[600, 86400]`, Basic is `[120, 86400]`, Standard is `[60, 86400]`, Ultimate is `[10, 86400]`, Exclusive is `[1, 86400]`. Default value is `600`.
     */
    readonly ttl?: pulumi.Input<number>;
    /**
     * The type of domain record. Valid values are `A`,`NS`,`MX`,`TXT`,`CNAME`,`SRV`,`AAAA`,`REDIRECT_URL` and `FORWORD_URL`.
     */
    readonly type: pulumi.Input<string>;
    /**
     * The value of domain record.
     */
    readonly value: pulumi.Input<string>;
}