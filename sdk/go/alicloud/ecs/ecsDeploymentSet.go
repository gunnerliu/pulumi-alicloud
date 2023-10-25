// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ecs

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Provides a ECS Deployment Set resource.
//
// For information about ECS Deployment Set and how to use it, see [What is Deployment Set](https://www.alibabacloud.com/help/en/doc-detail/91269.htm).
//
// > **NOTE:** Available in v1.140.0+.
//
// ## Import
//
// ECS Deployment Set can be imported using the id, e.g.
//
// ```sh
//
//	$ pulumi import alicloud:ecs/ecsDeploymentSet:EcsDeploymentSet example <id>
//
// ```
type EcsDeploymentSet struct {
	pulumi.CustomResourceState

	// The name of the deployment set. The name must be 2 to 128 characters in length and can contain letters, digits, colons (:), underscores (_), and hyphens (-). It must start with a letter and cannot start with `http://` or `https://`.
	DeploymentSetName pulumi.StringPtrOutput `pulumi:"deploymentSetName"`
	// The description of the deployment set. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The deployment domain. Valid values: `Default`.
	Domain pulumi.StringPtrOutput `pulumi:"domain"`
	// The deployment granularity. Valid values: `Host`.
	Granularity pulumi.StringPtrOutput `pulumi:"granularity"`
	// The on unable to redeploy failed instance. Valid values: `CancelMembershipAndStart`, `KeepStopped`.
	OnUnableToRedeployFailedInstance pulumi.StringPtrOutput `pulumi:"onUnableToRedeployFailedInstance"`
	// The deployment strategy. Valid values: `Availability`.
	Strategy pulumi.StringPtrOutput `pulumi:"strategy"`
}

// NewEcsDeploymentSet registers a new resource with the given unique name, arguments, and options.
func NewEcsDeploymentSet(ctx *pulumi.Context,
	name string, args *EcsDeploymentSetArgs, opts ...pulumi.ResourceOption) (*EcsDeploymentSet, error) {
	if args == nil {
		args = &EcsDeploymentSetArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource EcsDeploymentSet
	err := ctx.RegisterResource("alicloud:ecs/ecsDeploymentSet:EcsDeploymentSet", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetEcsDeploymentSet gets an existing EcsDeploymentSet resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetEcsDeploymentSet(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *EcsDeploymentSetState, opts ...pulumi.ResourceOption) (*EcsDeploymentSet, error) {
	var resource EcsDeploymentSet
	err := ctx.ReadResource("alicloud:ecs/ecsDeploymentSet:EcsDeploymentSet", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering EcsDeploymentSet resources.
type ecsDeploymentSetState struct {
	// The name of the deployment set. The name must be 2 to 128 characters in length and can contain letters, digits, colons (:), underscores (_), and hyphens (-). It must start with a letter and cannot start with `http://` or `https://`.
	DeploymentSetName *string `pulumi:"deploymentSetName"`
	// The description of the deployment set. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.
	Description *string `pulumi:"description"`
	// The deployment domain. Valid values: `Default`.
	Domain *string `pulumi:"domain"`
	// The deployment granularity. Valid values: `Host`.
	Granularity *string `pulumi:"granularity"`
	// The on unable to redeploy failed instance. Valid values: `CancelMembershipAndStart`, `KeepStopped`.
	OnUnableToRedeployFailedInstance *string `pulumi:"onUnableToRedeployFailedInstance"`
	// The deployment strategy. Valid values: `Availability`.
	Strategy *string `pulumi:"strategy"`
}

type EcsDeploymentSetState struct {
	// The name of the deployment set. The name must be 2 to 128 characters in length and can contain letters, digits, colons (:), underscores (_), and hyphens (-). It must start with a letter and cannot start with `http://` or `https://`.
	DeploymentSetName pulumi.StringPtrInput
	// The description of the deployment set. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.
	Description pulumi.StringPtrInput
	// The deployment domain. Valid values: `Default`.
	Domain pulumi.StringPtrInput
	// The deployment granularity. Valid values: `Host`.
	Granularity pulumi.StringPtrInput
	// The on unable to redeploy failed instance. Valid values: `CancelMembershipAndStart`, `KeepStopped`.
	OnUnableToRedeployFailedInstance pulumi.StringPtrInput
	// The deployment strategy. Valid values: `Availability`.
	Strategy pulumi.StringPtrInput
}

func (EcsDeploymentSetState) ElementType() reflect.Type {
	return reflect.TypeOf((*ecsDeploymentSetState)(nil)).Elem()
}

type ecsDeploymentSetArgs struct {
	// The name of the deployment set. The name must be 2 to 128 characters in length and can contain letters, digits, colons (:), underscores (_), and hyphens (-). It must start with a letter and cannot start with `http://` or `https://`.
	DeploymentSetName *string `pulumi:"deploymentSetName"`
	// The description of the deployment set. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.
	Description *string `pulumi:"description"`
	// The deployment domain. Valid values: `Default`.
	Domain *string `pulumi:"domain"`
	// The deployment granularity. Valid values: `Host`.
	Granularity *string `pulumi:"granularity"`
	// The on unable to redeploy failed instance. Valid values: `CancelMembershipAndStart`, `KeepStopped`.
	OnUnableToRedeployFailedInstance *string `pulumi:"onUnableToRedeployFailedInstance"`
	// The deployment strategy. Valid values: `Availability`.
	Strategy *string `pulumi:"strategy"`
}

// The set of arguments for constructing a EcsDeploymentSet resource.
type EcsDeploymentSetArgs struct {
	// The name of the deployment set. The name must be 2 to 128 characters in length and can contain letters, digits, colons (:), underscores (_), and hyphens (-). It must start with a letter and cannot start with `http://` or `https://`.
	DeploymentSetName pulumi.StringPtrInput
	// The description of the deployment set. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.
	Description pulumi.StringPtrInput
	// The deployment domain. Valid values: `Default`.
	Domain pulumi.StringPtrInput
	// The deployment granularity. Valid values: `Host`.
	Granularity pulumi.StringPtrInput
	// The on unable to redeploy failed instance. Valid values: `CancelMembershipAndStart`, `KeepStopped`.
	OnUnableToRedeployFailedInstance pulumi.StringPtrInput
	// The deployment strategy. Valid values: `Availability`.
	Strategy pulumi.StringPtrInput
}

func (EcsDeploymentSetArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*ecsDeploymentSetArgs)(nil)).Elem()
}

type EcsDeploymentSetInput interface {
	pulumi.Input

	ToEcsDeploymentSetOutput() EcsDeploymentSetOutput
	ToEcsDeploymentSetOutputWithContext(ctx context.Context) EcsDeploymentSetOutput
}

func (*EcsDeploymentSet) ElementType() reflect.Type {
	return reflect.TypeOf((**EcsDeploymentSet)(nil)).Elem()
}

func (i *EcsDeploymentSet) ToEcsDeploymentSetOutput() EcsDeploymentSetOutput {
	return i.ToEcsDeploymentSetOutputWithContext(context.Background())
}

func (i *EcsDeploymentSet) ToEcsDeploymentSetOutputWithContext(ctx context.Context) EcsDeploymentSetOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EcsDeploymentSetOutput)
}

func (i *EcsDeploymentSet) ToOutput(ctx context.Context) pulumix.Output[*EcsDeploymentSet] {
	return pulumix.Output[*EcsDeploymentSet]{
		OutputState: i.ToEcsDeploymentSetOutputWithContext(ctx).OutputState,
	}
}

// EcsDeploymentSetArrayInput is an input type that accepts EcsDeploymentSetArray and EcsDeploymentSetArrayOutput values.
// You can construct a concrete instance of `EcsDeploymentSetArrayInput` via:
//
//	EcsDeploymentSetArray{ EcsDeploymentSetArgs{...} }
type EcsDeploymentSetArrayInput interface {
	pulumi.Input

	ToEcsDeploymentSetArrayOutput() EcsDeploymentSetArrayOutput
	ToEcsDeploymentSetArrayOutputWithContext(context.Context) EcsDeploymentSetArrayOutput
}

type EcsDeploymentSetArray []EcsDeploymentSetInput

func (EcsDeploymentSetArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EcsDeploymentSet)(nil)).Elem()
}

func (i EcsDeploymentSetArray) ToEcsDeploymentSetArrayOutput() EcsDeploymentSetArrayOutput {
	return i.ToEcsDeploymentSetArrayOutputWithContext(context.Background())
}

func (i EcsDeploymentSetArray) ToEcsDeploymentSetArrayOutputWithContext(ctx context.Context) EcsDeploymentSetArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EcsDeploymentSetArrayOutput)
}

func (i EcsDeploymentSetArray) ToOutput(ctx context.Context) pulumix.Output[[]*EcsDeploymentSet] {
	return pulumix.Output[[]*EcsDeploymentSet]{
		OutputState: i.ToEcsDeploymentSetArrayOutputWithContext(ctx).OutputState,
	}
}

// EcsDeploymentSetMapInput is an input type that accepts EcsDeploymentSetMap and EcsDeploymentSetMapOutput values.
// You can construct a concrete instance of `EcsDeploymentSetMapInput` via:
//
//	EcsDeploymentSetMap{ "key": EcsDeploymentSetArgs{...} }
type EcsDeploymentSetMapInput interface {
	pulumi.Input

	ToEcsDeploymentSetMapOutput() EcsDeploymentSetMapOutput
	ToEcsDeploymentSetMapOutputWithContext(context.Context) EcsDeploymentSetMapOutput
}

type EcsDeploymentSetMap map[string]EcsDeploymentSetInput

func (EcsDeploymentSetMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EcsDeploymentSet)(nil)).Elem()
}

func (i EcsDeploymentSetMap) ToEcsDeploymentSetMapOutput() EcsDeploymentSetMapOutput {
	return i.ToEcsDeploymentSetMapOutputWithContext(context.Background())
}

func (i EcsDeploymentSetMap) ToEcsDeploymentSetMapOutputWithContext(ctx context.Context) EcsDeploymentSetMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EcsDeploymentSetMapOutput)
}

func (i EcsDeploymentSetMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*EcsDeploymentSet] {
	return pulumix.Output[map[string]*EcsDeploymentSet]{
		OutputState: i.ToEcsDeploymentSetMapOutputWithContext(ctx).OutputState,
	}
}

type EcsDeploymentSetOutput struct{ *pulumi.OutputState }

func (EcsDeploymentSetOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**EcsDeploymentSet)(nil)).Elem()
}

func (o EcsDeploymentSetOutput) ToEcsDeploymentSetOutput() EcsDeploymentSetOutput {
	return o
}

func (o EcsDeploymentSetOutput) ToEcsDeploymentSetOutputWithContext(ctx context.Context) EcsDeploymentSetOutput {
	return o
}

func (o EcsDeploymentSetOutput) ToOutput(ctx context.Context) pulumix.Output[*EcsDeploymentSet] {
	return pulumix.Output[*EcsDeploymentSet]{
		OutputState: o.OutputState,
	}
}

// The name of the deployment set. The name must be 2 to 128 characters in length and can contain letters, digits, colons (:), underscores (_), and hyphens (-). It must start with a letter and cannot start with `http://` or `https://`.
func (o EcsDeploymentSetOutput) DeploymentSetName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EcsDeploymentSet) pulumi.StringPtrOutput { return v.DeploymentSetName }).(pulumi.StringPtrOutput)
}

// The description of the deployment set. The description must be 2 to 256 characters in length and cannot start with `http://` or `https://`.
func (o EcsDeploymentSetOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EcsDeploymentSet) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The deployment domain. Valid values: `Default`.
func (o EcsDeploymentSetOutput) Domain() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EcsDeploymentSet) pulumi.StringPtrOutput { return v.Domain }).(pulumi.StringPtrOutput)
}

// The deployment granularity. Valid values: `Host`.
func (o EcsDeploymentSetOutput) Granularity() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EcsDeploymentSet) pulumi.StringPtrOutput { return v.Granularity }).(pulumi.StringPtrOutput)
}

// The on unable to redeploy failed instance. Valid values: `CancelMembershipAndStart`, `KeepStopped`.
func (o EcsDeploymentSetOutput) OnUnableToRedeployFailedInstance() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EcsDeploymentSet) pulumi.StringPtrOutput { return v.OnUnableToRedeployFailedInstance }).(pulumi.StringPtrOutput)
}

// The deployment strategy. Valid values: `Availability`.
func (o EcsDeploymentSetOutput) Strategy() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EcsDeploymentSet) pulumi.StringPtrOutput { return v.Strategy }).(pulumi.StringPtrOutput)
}

type EcsDeploymentSetArrayOutput struct{ *pulumi.OutputState }

func (EcsDeploymentSetArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EcsDeploymentSet)(nil)).Elem()
}

func (o EcsDeploymentSetArrayOutput) ToEcsDeploymentSetArrayOutput() EcsDeploymentSetArrayOutput {
	return o
}

func (o EcsDeploymentSetArrayOutput) ToEcsDeploymentSetArrayOutputWithContext(ctx context.Context) EcsDeploymentSetArrayOutput {
	return o
}

func (o EcsDeploymentSetArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*EcsDeploymentSet] {
	return pulumix.Output[[]*EcsDeploymentSet]{
		OutputState: o.OutputState,
	}
}

func (o EcsDeploymentSetArrayOutput) Index(i pulumi.IntInput) EcsDeploymentSetOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *EcsDeploymentSet {
		return vs[0].([]*EcsDeploymentSet)[vs[1].(int)]
	}).(EcsDeploymentSetOutput)
}

type EcsDeploymentSetMapOutput struct{ *pulumi.OutputState }

func (EcsDeploymentSetMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EcsDeploymentSet)(nil)).Elem()
}

func (o EcsDeploymentSetMapOutput) ToEcsDeploymentSetMapOutput() EcsDeploymentSetMapOutput {
	return o
}

func (o EcsDeploymentSetMapOutput) ToEcsDeploymentSetMapOutputWithContext(ctx context.Context) EcsDeploymentSetMapOutput {
	return o
}

func (o EcsDeploymentSetMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*EcsDeploymentSet] {
	return pulumix.Output[map[string]*EcsDeploymentSet]{
		OutputState: o.OutputState,
	}
}

func (o EcsDeploymentSetMapOutput) MapIndex(k pulumi.StringInput) EcsDeploymentSetOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *EcsDeploymentSet {
		return vs[0].(map[string]*EcsDeploymentSet)[vs[1].(string)]
	}).(EcsDeploymentSetOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*EcsDeploymentSetInput)(nil)).Elem(), &EcsDeploymentSet{})
	pulumi.RegisterInputType(reflect.TypeOf((*EcsDeploymentSetArrayInput)(nil)).Elem(), EcsDeploymentSetArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*EcsDeploymentSetMapInput)(nil)).Elem(), EcsDeploymentSetMap{})
	pulumi.RegisterOutputType(EcsDeploymentSetOutput{})
	pulumi.RegisterOutputType(EcsDeploymentSetArrayOutput{})
	pulumi.RegisterOutputType(EcsDeploymentSetMapOutput{})
}
