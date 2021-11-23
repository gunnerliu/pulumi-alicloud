// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Bastion Host User resource.
 *
 * For information about Bastion Host User and how to use it, see [What is User](https://www.alibabacloud.com/help/doc-detail/204503.htm).
 *
 * > **NOTE:** Available in v1.133.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const local = new alicloud.bastionhost.User("Local", {
 *     instanceId: "example_value",
 *     mobile: "13312345678",
 *     mobileCountryCode: "CN",
 *     password: "YourPassword-123",
 *     source: "Local",
 *     userName: "my-local-user",
 * });
 * const ram = new alicloud.bastionhost.User("Ram", {
 *     instanceId: "example_value",
 *     mobile: "13312345678",
 *     mobileCountryCode: "CN",
 *     password: "YourPassword-123",
 *     source: "Ram",
 *     sourceUserId: "1234567890",
 *     userName: "my-ram-user",
 * });
 * ```
 *
 * ## Import
 *
 * Bastion Host User can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:bastionhost/user:User example <instance_id>:<user_id>
 * ```
 */
export class User extends pulumi.CustomResource {
    /**
     * Get an existing User resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: UserState, opts?: pulumi.CustomResourceOptions): User {
        return new User(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:bastionhost/user:User';

    /**
     * Returns true if the given object is an instance of User.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is User {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === User.__pulumiType;
    }

    /**
     * Specify the New of the User That Created the Remark Information. Supports up to 500 Characters.
     */
    public readonly comment!: pulumi.Output<string | undefined>;
    /**
     * Specify the New Created the User's Display Name. Supports up to 128 Characters.
     */
    public readonly displayName!: pulumi.Output<string>;
    /**
     * Specify the New User's Mailbox.
     */
    public readonly email!: pulumi.Output<string | undefined>;
    /**
     * You Want to Query the User the Bastion Host ID of.
     */
    public readonly instanceId!: pulumi.Output<string>;
    /**
     * Specify the New of the User That Created a Different Mobile Phone Number from Your.
     */
    public readonly mobile!: pulumi.Output<string | undefined>;
    /**
     * Specify the New Create User Mobile Phone Number of the International Domain Name. The Default Value Is the CN. Valid Values:
     * * CN: Mainland China (+86)
     * * HK: hong Kong, China (+852)
     * * MO: Macau, China (+853)
     * * TW: Taiwan, China (+886)
     * * RU: Russian (+7)
     * * SG: Singapore (+65)
     * * MY: malaysia (+60)
     * * ID: Indonesia (+62)
     * * DE: Germany (+49)
     * * AU: Australia (+61)
     * * US: United States (+1)
     * * AE: dubai (+971)
     * * JP: Japan (+81) Introducing the Long-Range
     * * GB: United Kingdom (+44)
     * * IN: India (+91)
     * * KR: South Korea (+82)
     * * PH: philippines (+63)
     * * CH: Switzerland (+41)
     * * SE: Sweden (+46)
     */
    public readonly mobileCountryCode!: pulumi.Output<string>;
    /**
     * Specify the New User's Password. Supports up to 128 Characters. Description of the New User as the Source of the Local User (That Is, Source Value for Local, this Parameter Is Required.
     */
    public readonly password!: pulumi.Output<string | undefined>;
    /**
     * Specify the New of the User That Created the Source. Valid Values: 
     * * Local: Local User
     * * RAM: Ram User
     */
    public readonly source!: pulumi.Output<string>;
    /**
     * Specify the Newly Created User Is Uniquely Identified. Indicates That the Parameter Is a Bastion Host Corresponding to the User with the Ram User's Unique Identifier. The Newly Created User Source Grant Permission to a RAM User (That Is, Source Used as a Ram), this Parameter Is Required. You Can Call Access Control of Listusers Interface from the Return Data Userid to Obtain the Parameters.
     */
    public readonly sourceUserId!: pulumi.Output<string | undefined>;
    /**
     * The status of the resource. Valid values: `Frozen`, `Normal`.
     */
    public readonly status!: pulumi.Output<string>;
    /**
     * The User ID.
     */
    public /*out*/ readonly userId!: pulumi.Output<string>;
    /**
     * Specify the New User Name. This Parameter Is Only by Letters, Lowercase Letters, Numbers, and Underscores (_), Supports up to 128 Characters.
     */
    public readonly userName!: pulumi.Output<string>;

    /**
     * Create a User resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: UserArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: UserArgs | UserState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as UserState | undefined;
            inputs["comment"] = state ? state.comment : undefined;
            inputs["displayName"] = state ? state.displayName : undefined;
            inputs["email"] = state ? state.email : undefined;
            inputs["instanceId"] = state ? state.instanceId : undefined;
            inputs["mobile"] = state ? state.mobile : undefined;
            inputs["mobileCountryCode"] = state ? state.mobileCountryCode : undefined;
            inputs["password"] = state ? state.password : undefined;
            inputs["source"] = state ? state.source : undefined;
            inputs["sourceUserId"] = state ? state.sourceUserId : undefined;
            inputs["status"] = state ? state.status : undefined;
            inputs["userId"] = state ? state.userId : undefined;
            inputs["userName"] = state ? state.userName : undefined;
        } else {
            const args = argsOrState as UserArgs | undefined;
            if ((!args || args.instanceId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'instanceId'");
            }
            if ((!args || args.source === undefined) && !opts.urn) {
                throw new Error("Missing required property 'source'");
            }
            if ((!args || args.userName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'userName'");
            }
            inputs["comment"] = args ? args.comment : undefined;
            inputs["displayName"] = args ? args.displayName : undefined;
            inputs["email"] = args ? args.email : undefined;
            inputs["instanceId"] = args ? args.instanceId : undefined;
            inputs["mobile"] = args ? args.mobile : undefined;
            inputs["mobileCountryCode"] = args ? args.mobileCountryCode : undefined;
            inputs["password"] = args ? args.password : undefined;
            inputs["source"] = args ? args.source : undefined;
            inputs["sourceUserId"] = args ? args.sourceUserId : undefined;
            inputs["status"] = args ? args.status : undefined;
            inputs["userName"] = args ? args.userName : undefined;
            inputs["userId"] = undefined /*out*/;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(User.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering User resources.
 */
export interface UserState {
    /**
     * Specify the New of the User That Created the Remark Information. Supports up to 500 Characters.
     */
    comment?: pulumi.Input<string>;
    /**
     * Specify the New Created the User's Display Name. Supports up to 128 Characters.
     */
    displayName?: pulumi.Input<string>;
    /**
     * Specify the New User's Mailbox.
     */
    email?: pulumi.Input<string>;
    /**
     * You Want to Query the User the Bastion Host ID of.
     */
    instanceId?: pulumi.Input<string>;
    /**
     * Specify the New of the User That Created a Different Mobile Phone Number from Your.
     */
    mobile?: pulumi.Input<string>;
    /**
     * Specify the New Create User Mobile Phone Number of the International Domain Name. The Default Value Is the CN. Valid Values:
     * * CN: Mainland China (+86)
     * * HK: hong Kong, China (+852)
     * * MO: Macau, China (+853)
     * * TW: Taiwan, China (+886)
     * * RU: Russian (+7)
     * * SG: Singapore (+65)
     * * MY: malaysia (+60)
     * * ID: Indonesia (+62)
     * * DE: Germany (+49)
     * * AU: Australia (+61)
     * * US: United States (+1)
     * * AE: dubai (+971)
     * * JP: Japan (+81) Introducing the Long-Range
     * * GB: United Kingdom (+44)
     * * IN: India (+91)
     * * KR: South Korea (+82)
     * * PH: philippines (+63)
     * * CH: Switzerland (+41)
     * * SE: Sweden (+46)
     */
    mobileCountryCode?: pulumi.Input<string>;
    /**
     * Specify the New User's Password. Supports up to 128 Characters. Description of the New User as the Source of the Local User (That Is, Source Value for Local, this Parameter Is Required.
     */
    password?: pulumi.Input<string>;
    /**
     * Specify the New of the User That Created the Source. Valid Values: 
     * * Local: Local User
     * * RAM: Ram User
     */
    source?: pulumi.Input<string>;
    /**
     * Specify the Newly Created User Is Uniquely Identified. Indicates That the Parameter Is a Bastion Host Corresponding to the User with the Ram User's Unique Identifier. The Newly Created User Source Grant Permission to a RAM User (That Is, Source Used as a Ram), this Parameter Is Required. You Can Call Access Control of Listusers Interface from the Return Data Userid to Obtain the Parameters.
     */
    sourceUserId?: pulumi.Input<string>;
    /**
     * The status of the resource. Valid values: `Frozen`, `Normal`.
     */
    status?: pulumi.Input<string>;
    /**
     * The User ID.
     */
    userId?: pulumi.Input<string>;
    /**
     * Specify the New User Name. This Parameter Is Only by Letters, Lowercase Letters, Numbers, and Underscores (_), Supports up to 128 Characters.
     */
    userName?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a User resource.
 */
export interface UserArgs {
    /**
     * Specify the New of the User That Created the Remark Information. Supports up to 500 Characters.
     */
    comment?: pulumi.Input<string>;
    /**
     * Specify the New Created the User's Display Name. Supports up to 128 Characters.
     */
    displayName?: pulumi.Input<string>;
    /**
     * Specify the New User's Mailbox.
     */
    email?: pulumi.Input<string>;
    /**
     * You Want to Query the User the Bastion Host ID of.
     */
    instanceId: pulumi.Input<string>;
    /**
     * Specify the New of the User That Created a Different Mobile Phone Number from Your.
     */
    mobile?: pulumi.Input<string>;
    /**
     * Specify the New Create User Mobile Phone Number of the International Domain Name. The Default Value Is the CN. Valid Values:
     * * CN: Mainland China (+86)
     * * HK: hong Kong, China (+852)
     * * MO: Macau, China (+853)
     * * TW: Taiwan, China (+886)
     * * RU: Russian (+7)
     * * SG: Singapore (+65)
     * * MY: malaysia (+60)
     * * ID: Indonesia (+62)
     * * DE: Germany (+49)
     * * AU: Australia (+61)
     * * US: United States (+1)
     * * AE: dubai (+971)
     * * JP: Japan (+81) Introducing the Long-Range
     * * GB: United Kingdom (+44)
     * * IN: India (+91)
     * * KR: South Korea (+82)
     * * PH: philippines (+63)
     * * CH: Switzerland (+41)
     * * SE: Sweden (+46)
     */
    mobileCountryCode?: pulumi.Input<string>;
    /**
     * Specify the New User's Password. Supports up to 128 Characters. Description of the New User as the Source of the Local User (That Is, Source Value for Local, this Parameter Is Required.
     */
    password?: pulumi.Input<string>;
    /**
     * Specify the New of the User That Created the Source. Valid Values: 
     * * Local: Local User
     * * RAM: Ram User
     */
    source: pulumi.Input<string>;
    /**
     * Specify the Newly Created User Is Uniquely Identified. Indicates That the Parameter Is a Bastion Host Corresponding to the User with the Ram User's Unique Identifier. The Newly Created User Source Grant Permission to a RAM User (That Is, Source Used as a Ram), this Parameter Is Required. You Can Call Access Control of Listusers Interface from the Return Data Userid to Obtain the Parameters.
     */
    sourceUserId?: pulumi.Input<string>;
    /**
     * The status of the resource. Valid values: `Frozen`, `Normal`.
     */
    status?: pulumi.Input<string>;
    /**
     * Specify the New User Name. This Parameter Is Only by Letters, Lowercase Letters, Numbers, and Underscores (_), Supports up to 128 Characters.
     */
    userName: pulumi.Input<string>;
}