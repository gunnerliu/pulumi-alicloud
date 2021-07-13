// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package eventbridge

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type GetEventBusesBus struct {
	CreateTime   string `pulumi:"createTime"`
	Description  string `pulumi:"description"`
	EventBusName string `pulumi:"eventBusName"`
	Id           string `pulumi:"id"`
}

// GetEventBusesBusInput is an input type that accepts GetEventBusesBusArgs and GetEventBusesBusOutput values.
// You can construct a concrete instance of `GetEventBusesBusInput` via:
//
//          GetEventBusesBusArgs{...}
type GetEventBusesBusInput interface {
	pulumi.Input

	ToGetEventBusesBusOutput() GetEventBusesBusOutput
	ToGetEventBusesBusOutputWithContext(context.Context) GetEventBusesBusOutput
}

type GetEventBusesBusArgs struct {
	CreateTime   pulumi.StringInput `pulumi:"createTime"`
	Description  pulumi.StringInput `pulumi:"description"`
	EventBusName pulumi.StringInput `pulumi:"eventBusName"`
	Id           pulumi.StringInput `pulumi:"id"`
}

func (GetEventBusesBusArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetEventBusesBus)(nil)).Elem()
}

func (i GetEventBusesBusArgs) ToGetEventBusesBusOutput() GetEventBusesBusOutput {
	return i.ToGetEventBusesBusOutputWithContext(context.Background())
}

func (i GetEventBusesBusArgs) ToGetEventBusesBusOutputWithContext(ctx context.Context) GetEventBusesBusOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetEventBusesBusOutput)
}

// GetEventBusesBusArrayInput is an input type that accepts GetEventBusesBusArray and GetEventBusesBusArrayOutput values.
// You can construct a concrete instance of `GetEventBusesBusArrayInput` via:
//
//          GetEventBusesBusArray{ GetEventBusesBusArgs{...} }
type GetEventBusesBusArrayInput interface {
	pulumi.Input

	ToGetEventBusesBusArrayOutput() GetEventBusesBusArrayOutput
	ToGetEventBusesBusArrayOutputWithContext(context.Context) GetEventBusesBusArrayOutput
}

type GetEventBusesBusArray []GetEventBusesBusInput

func (GetEventBusesBusArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetEventBusesBus)(nil)).Elem()
}

func (i GetEventBusesBusArray) ToGetEventBusesBusArrayOutput() GetEventBusesBusArrayOutput {
	return i.ToGetEventBusesBusArrayOutputWithContext(context.Background())
}

func (i GetEventBusesBusArray) ToGetEventBusesBusArrayOutputWithContext(ctx context.Context) GetEventBusesBusArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetEventBusesBusArrayOutput)
}

type GetEventBusesBusOutput struct{ *pulumi.OutputState }

func (GetEventBusesBusOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetEventBusesBus)(nil)).Elem()
}

func (o GetEventBusesBusOutput) ToGetEventBusesBusOutput() GetEventBusesBusOutput {
	return o
}

func (o GetEventBusesBusOutput) ToGetEventBusesBusOutputWithContext(ctx context.Context) GetEventBusesBusOutput {
	return o
}

func (o GetEventBusesBusOutput) CreateTime() pulumi.StringOutput {
	return o.ApplyT(func(v GetEventBusesBus) string { return v.CreateTime }).(pulumi.StringOutput)
}

func (o GetEventBusesBusOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v GetEventBusesBus) string { return v.Description }).(pulumi.StringOutput)
}

func (o GetEventBusesBusOutput) EventBusName() pulumi.StringOutput {
	return o.ApplyT(func(v GetEventBusesBus) string { return v.EventBusName }).(pulumi.StringOutput)
}

func (o GetEventBusesBusOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetEventBusesBus) string { return v.Id }).(pulumi.StringOutput)
}

type GetEventBusesBusArrayOutput struct{ *pulumi.OutputState }

func (GetEventBusesBusArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetEventBusesBus)(nil)).Elem()
}

func (o GetEventBusesBusArrayOutput) ToGetEventBusesBusArrayOutput() GetEventBusesBusArrayOutput {
	return o
}

func (o GetEventBusesBusArrayOutput) ToGetEventBusesBusArrayOutputWithContext(ctx context.Context) GetEventBusesBusArrayOutput {
	return o
}

func (o GetEventBusesBusArrayOutput) Index(i pulumi.IntInput) GetEventBusesBusOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) GetEventBusesBus {
		return vs[0].([]GetEventBusesBus)[vs[1].(int)]
	}).(GetEventBusesBusOutput)
}

type GetSchemaGroupsGroup struct {
	Description string `pulumi:"description"`
	Format      string `pulumi:"format"`
	GroupId     string `pulumi:"groupId"`
	Id          string `pulumi:"id"`
}

// GetSchemaGroupsGroupInput is an input type that accepts GetSchemaGroupsGroupArgs and GetSchemaGroupsGroupOutput values.
// You can construct a concrete instance of `GetSchemaGroupsGroupInput` via:
//
//          GetSchemaGroupsGroupArgs{...}
type GetSchemaGroupsGroupInput interface {
	pulumi.Input

	ToGetSchemaGroupsGroupOutput() GetSchemaGroupsGroupOutput
	ToGetSchemaGroupsGroupOutputWithContext(context.Context) GetSchemaGroupsGroupOutput
}

type GetSchemaGroupsGroupArgs struct {
	Description pulumi.StringInput `pulumi:"description"`
	Format      pulumi.StringInput `pulumi:"format"`
	GroupId     pulumi.StringInput `pulumi:"groupId"`
	Id          pulumi.StringInput `pulumi:"id"`
}

func (GetSchemaGroupsGroupArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSchemaGroupsGroup)(nil)).Elem()
}

func (i GetSchemaGroupsGroupArgs) ToGetSchemaGroupsGroupOutput() GetSchemaGroupsGroupOutput {
	return i.ToGetSchemaGroupsGroupOutputWithContext(context.Background())
}

func (i GetSchemaGroupsGroupArgs) ToGetSchemaGroupsGroupOutputWithContext(ctx context.Context) GetSchemaGroupsGroupOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetSchemaGroupsGroupOutput)
}

// GetSchemaGroupsGroupArrayInput is an input type that accepts GetSchemaGroupsGroupArray and GetSchemaGroupsGroupArrayOutput values.
// You can construct a concrete instance of `GetSchemaGroupsGroupArrayInput` via:
//
//          GetSchemaGroupsGroupArray{ GetSchemaGroupsGroupArgs{...} }
type GetSchemaGroupsGroupArrayInput interface {
	pulumi.Input

	ToGetSchemaGroupsGroupArrayOutput() GetSchemaGroupsGroupArrayOutput
	ToGetSchemaGroupsGroupArrayOutputWithContext(context.Context) GetSchemaGroupsGroupArrayOutput
}

type GetSchemaGroupsGroupArray []GetSchemaGroupsGroupInput

func (GetSchemaGroupsGroupArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetSchemaGroupsGroup)(nil)).Elem()
}

func (i GetSchemaGroupsGroupArray) ToGetSchemaGroupsGroupArrayOutput() GetSchemaGroupsGroupArrayOutput {
	return i.ToGetSchemaGroupsGroupArrayOutputWithContext(context.Background())
}

func (i GetSchemaGroupsGroupArray) ToGetSchemaGroupsGroupArrayOutputWithContext(ctx context.Context) GetSchemaGroupsGroupArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GetSchemaGroupsGroupArrayOutput)
}

type GetSchemaGroupsGroupOutput struct{ *pulumi.OutputState }

func (GetSchemaGroupsGroupOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetSchemaGroupsGroup)(nil)).Elem()
}

func (o GetSchemaGroupsGroupOutput) ToGetSchemaGroupsGroupOutput() GetSchemaGroupsGroupOutput {
	return o
}

func (o GetSchemaGroupsGroupOutput) ToGetSchemaGroupsGroupOutputWithContext(ctx context.Context) GetSchemaGroupsGroupOutput {
	return o
}

func (o GetSchemaGroupsGroupOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v GetSchemaGroupsGroup) string { return v.Description }).(pulumi.StringOutput)
}

func (o GetSchemaGroupsGroupOutput) Format() pulumi.StringOutput {
	return o.ApplyT(func(v GetSchemaGroupsGroup) string { return v.Format }).(pulumi.StringOutput)
}

func (o GetSchemaGroupsGroupOutput) GroupId() pulumi.StringOutput {
	return o.ApplyT(func(v GetSchemaGroupsGroup) string { return v.GroupId }).(pulumi.StringOutput)
}

func (o GetSchemaGroupsGroupOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetSchemaGroupsGroup) string { return v.Id }).(pulumi.StringOutput)
}

type GetSchemaGroupsGroupArrayOutput struct{ *pulumi.OutputState }

func (GetSchemaGroupsGroupArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]GetSchemaGroupsGroup)(nil)).Elem()
}

func (o GetSchemaGroupsGroupArrayOutput) ToGetSchemaGroupsGroupArrayOutput() GetSchemaGroupsGroupArrayOutput {
	return o
}

func (o GetSchemaGroupsGroupArrayOutput) ToGetSchemaGroupsGroupArrayOutputWithContext(ctx context.Context) GetSchemaGroupsGroupArrayOutput {
	return o
}

func (o GetSchemaGroupsGroupArrayOutput) Index(i pulumi.IntInput) GetSchemaGroupsGroupOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) GetSchemaGroupsGroup {
		return vs[0].([]GetSchemaGroupsGroup)[vs[1].(int)]
	}).(GetSchemaGroupsGroupOutput)
}

func init() {
	pulumi.RegisterOutputType(GetEventBusesBusOutput{})
	pulumi.RegisterOutputType(GetEventBusesBusArrayOutput{})
	pulumi.RegisterOutputType(GetSchemaGroupsGroupOutput{})
	pulumi.RegisterOutputType(GetSchemaGroupsGroupArrayOutput{})
}
