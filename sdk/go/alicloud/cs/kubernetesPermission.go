// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cs

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This resource will help you implement RBAC authorization for the kubernetes cluster, see [What is kubernetes permissions](https://www.alibabacloud.com/help/en/ack/ack-managed-and-ack-dedicated/developer-reference/api-grantpermissions).
//
// > **NOTE:** Please make sure that the target RAM user has been granted a RAM policy with at least read-only permission of the target cluster in the RAM console. Otherwise, the `ErrorRamPolicyConfig` error will be returned.
// For more information about how to authorize a RAM user by attaching RAM policies, see [Create a custom RAM policy](https://www.alibabacloud.com/help/doc-detail/86485.htm).
//
// > **NOTE:** If you call this operation as a RAM user, make sure that this RAM user has the permissions to grant other RAM users the permissions to manage ACK clusters. Otherwise, the `StatusForbidden` or `ForbiddenGrantPermissions` errors will be returned. For more information, see [Use a RAM user to grant RBAC permissions to other RAM users](https://www.alibabacloud.com/help/faq-detail/119035.htm).
//
// > **NOTE:** This operation **overwrites** the permissions that have been granted to the specified RAM user. When you call this operation, make sure that the required permissions are included.
//
// > **NOTE:** Available since v1.122.0.
//
// ## Import
//
// alicloud_cs_kubernetes_permissions can be imported using the RAM user id or Ram Role id, e.g.
//
// ```sh
//
//	$ pulumi import alicloud:cs/kubernetesPermission:KubernetesPermission user <uid>
//
// ```
type KubernetesPermission struct {
	pulumi.CustomResourceState

	// A list of user permission. See `permissions` below.
	Permissions KubernetesPermissionPermissionArrayOutput `pulumi:"permissions"`
	// The ID of the Ram user, and it can also be the id of the Ram Role. If you use Ram Role id, you need to set `isRamRole` to `true` during authorization.
	Uid pulumi.StringOutput `pulumi:"uid"`
}

// NewKubernetesPermission registers a new resource with the given unique name, arguments, and options.
func NewKubernetesPermission(ctx *pulumi.Context,
	name string, args *KubernetesPermissionArgs, opts ...pulumi.ResourceOption) (*KubernetesPermission, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Uid == nil {
		return nil, errors.New("invalid value for required argument 'Uid'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource KubernetesPermission
	err := ctx.RegisterResource("alicloud:cs/kubernetesPermission:KubernetesPermission", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetKubernetesPermission gets an existing KubernetesPermission resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetKubernetesPermission(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *KubernetesPermissionState, opts ...pulumi.ResourceOption) (*KubernetesPermission, error) {
	var resource KubernetesPermission
	err := ctx.ReadResource("alicloud:cs/kubernetesPermission:KubernetesPermission", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering KubernetesPermission resources.
type kubernetesPermissionState struct {
	// A list of user permission. See `permissions` below.
	Permissions []KubernetesPermissionPermission `pulumi:"permissions"`
	// The ID of the Ram user, and it can also be the id of the Ram Role. If you use Ram Role id, you need to set `isRamRole` to `true` during authorization.
	Uid *string `pulumi:"uid"`
}

type KubernetesPermissionState struct {
	// A list of user permission. See `permissions` below.
	Permissions KubernetesPermissionPermissionArrayInput
	// The ID of the Ram user, and it can also be the id of the Ram Role. If you use Ram Role id, you need to set `isRamRole` to `true` during authorization.
	Uid pulumi.StringPtrInput
}

func (KubernetesPermissionState) ElementType() reflect.Type {
	return reflect.TypeOf((*kubernetesPermissionState)(nil)).Elem()
}

type kubernetesPermissionArgs struct {
	// A list of user permission. See `permissions` below.
	Permissions []KubernetesPermissionPermission `pulumi:"permissions"`
	// The ID of the Ram user, and it can also be the id of the Ram Role. If you use Ram Role id, you need to set `isRamRole` to `true` during authorization.
	Uid string `pulumi:"uid"`
}

// The set of arguments for constructing a KubernetesPermission resource.
type KubernetesPermissionArgs struct {
	// A list of user permission. See `permissions` below.
	Permissions KubernetesPermissionPermissionArrayInput
	// The ID of the Ram user, and it can also be the id of the Ram Role. If you use Ram Role id, you need to set `isRamRole` to `true` during authorization.
	Uid pulumi.StringInput
}

func (KubernetesPermissionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*kubernetesPermissionArgs)(nil)).Elem()
}

type KubernetesPermissionInput interface {
	pulumi.Input

	ToKubernetesPermissionOutput() KubernetesPermissionOutput
	ToKubernetesPermissionOutputWithContext(ctx context.Context) KubernetesPermissionOutput
}

func (*KubernetesPermission) ElementType() reflect.Type {
	return reflect.TypeOf((**KubernetesPermission)(nil)).Elem()
}

func (i *KubernetesPermission) ToKubernetesPermissionOutput() KubernetesPermissionOutput {
	return i.ToKubernetesPermissionOutputWithContext(context.Background())
}

func (i *KubernetesPermission) ToKubernetesPermissionOutputWithContext(ctx context.Context) KubernetesPermissionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(KubernetesPermissionOutput)
}

// KubernetesPermissionArrayInput is an input type that accepts KubernetesPermissionArray and KubernetesPermissionArrayOutput values.
// You can construct a concrete instance of `KubernetesPermissionArrayInput` via:
//
//	KubernetesPermissionArray{ KubernetesPermissionArgs{...} }
type KubernetesPermissionArrayInput interface {
	pulumi.Input

	ToKubernetesPermissionArrayOutput() KubernetesPermissionArrayOutput
	ToKubernetesPermissionArrayOutputWithContext(context.Context) KubernetesPermissionArrayOutput
}

type KubernetesPermissionArray []KubernetesPermissionInput

func (KubernetesPermissionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*KubernetesPermission)(nil)).Elem()
}

func (i KubernetesPermissionArray) ToKubernetesPermissionArrayOutput() KubernetesPermissionArrayOutput {
	return i.ToKubernetesPermissionArrayOutputWithContext(context.Background())
}

func (i KubernetesPermissionArray) ToKubernetesPermissionArrayOutputWithContext(ctx context.Context) KubernetesPermissionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(KubernetesPermissionArrayOutput)
}

// KubernetesPermissionMapInput is an input type that accepts KubernetesPermissionMap and KubernetesPermissionMapOutput values.
// You can construct a concrete instance of `KubernetesPermissionMapInput` via:
//
//	KubernetesPermissionMap{ "key": KubernetesPermissionArgs{...} }
type KubernetesPermissionMapInput interface {
	pulumi.Input

	ToKubernetesPermissionMapOutput() KubernetesPermissionMapOutput
	ToKubernetesPermissionMapOutputWithContext(context.Context) KubernetesPermissionMapOutput
}

type KubernetesPermissionMap map[string]KubernetesPermissionInput

func (KubernetesPermissionMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*KubernetesPermission)(nil)).Elem()
}

func (i KubernetesPermissionMap) ToKubernetesPermissionMapOutput() KubernetesPermissionMapOutput {
	return i.ToKubernetesPermissionMapOutputWithContext(context.Background())
}

func (i KubernetesPermissionMap) ToKubernetesPermissionMapOutputWithContext(ctx context.Context) KubernetesPermissionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(KubernetesPermissionMapOutput)
}

type KubernetesPermissionOutput struct{ *pulumi.OutputState }

func (KubernetesPermissionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**KubernetesPermission)(nil)).Elem()
}

func (o KubernetesPermissionOutput) ToKubernetesPermissionOutput() KubernetesPermissionOutput {
	return o
}

func (o KubernetesPermissionOutput) ToKubernetesPermissionOutputWithContext(ctx context.Context) KubernetesPermissionOutput {
	return o
}

// A list of user permission. See `permissions` below.
func (o KubernetesPermissionOutput) Permissions() KubernetesPermissionPermissionArrayOutput {
	return o.ApplyT(func(v *KubernetesPermission) KubernetesPermissionPermissionArrayOutput { return v.Permissions }).(KubernetesPermissionPermissionArrayOutput)
}

// The ID of the Ram user, and it can also be the id of the Ram Role. If you use Ram Role id, you need to set `isRamRole` to `true` during authorization.
func (o KubernetesPermissionOutput) Uid() pulumi.StringOutput {
	return o.ApplyT(func(v *KubernetesPermission) pulumi.StringOutput { return v.Uid }).(pulumi.StringOutput)
}

type KubernetesPermissionArrayOutput struct{ *pulumi.OutputState }

func (KubernetesPermissionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*KubernetesPermission)(nil)).Elem()
}

func (o KubernetesPermissionArrayOutput) ToKubernetesPermissionArrayOutput() KubernetesPermissionArrayOutput {
	return o
}

func (o KubernetesPermissionArrayOutput) ToKubernetesPermissionArrayOutputWithContext(ctx context.Context) KubernetesPermissionArrayOutput {
	return o
}

func (o KubernetesPermissionArrayOutput) Index(i pulumi.IntInput) KubernetesPermissionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *KubernetesPermission {
		return vs[0].([]*KubernetesPermission)[vs[1].(int)]
	}).(KubernetesPermissionOutput)
}

type KubernetesPermissionMapOutput struct{ *pulumi.OutputState }

func (KubernetesPermissionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*KubernetesPermission)(nil)).Elem()
}

func (o KubernetesPermissionMapOutput) ToKubernetesPermissionMapOutput() KubernetesPermissionMapOutput {
	return o
}

func (o KubernetesPermissionMapOutput) ToKubernetesPermissionMapOutputWithContext(ctx context.Context) KubernetesPermissionMapOutput {
	return o
}

func (o KubernetesPermissionMapOutput) MapIndex(k pulumi.StringInput) KubernetesPermissionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *KubernetesPermission {
		return vs[0].(map[string]*KubernetesPermission)[vs[1].(string)]
	}).(KubernetesPermissionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*KubernetesPermissionInput)(nil)).Elem(), &KubernetesPermission{})
	pulumi.RegisterInputType(reflect.TypeOf((*KubernetesPermissionArrayInput)(nil)).Elem(), KubernetesPermissionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*KubernetesPermissionMapInput)(nil)).Elem(), KubernetesPermissionMap{})
	pulumi.RegisterOutputType(KubernetesPermissionOutput{})
	pulumi.RegisterOutputType(KubernetesPermissionArrayOutput{})
	pulumi.RegisterOutputType(KubernetesPermissionMapOutput{})
}
