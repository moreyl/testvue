
var AddUser = Vue.extend({
    template: '#add-user',
    data: function () {
        return {user: {name: '', fullName: '', role: 'Choose', costCentre: 'Choose', policyIds: [] }, roles: roles, costCentres: costCentres, globalPolicyIds: globalPolicyIds }
    },
    methods: {
        createUser: function() {
            var user = this.user;
            users.push({
                // id: Math.random().toString().split('.')[1],
                name: user.name,
                fullName: user.fullName,
                role: user.role,
                costCentre: user.costCentre,
                policyIds: user.policyIds,
            });
            router.push('/');
            message = user.name + '('+ user.fullName +') has been mapped to ' + user.role + ' on ' + new Date().toLocaleString() ;
        }
    }
});